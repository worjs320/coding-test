package coding.test.baekjoon.그래프.적록색약;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int N;
    static char[][] map;
    static boolean[][] visited;
    static int[] xr = {1, -1, 0, 0};
    static int[] yr = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    checkArea(new Dot(j, i), map[i][j]);
                    count++;
                }
            }
        }

        sb.append(count).append(" ");

        count = 0;
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    if (map[i][j] == 'R') {
                        checkAreaTwoColor(new Dot(j, i), 'R', 'G');
                    } else if (map[i][j] == 'G') {
                        checkAreaTwoColor(new Dot(j, i), 'R', 'G');
                    } else {
                        checkArea(new Dot(j, i), 'B');
                    }
                    count++;
                }
            }
        }

        sb.append(count);

        System.out.println(sb);
    }

    public static void checkArea(Dot dot, char color) {
        Queue<Dot> queue = new LinkedList<>();
        queue.add(dot);
        visited[dot.y][dot.x] = true;

        while (!queue.isEmpty()) {
            Dot qDot = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = qDot.x + xr[i];
                int y = qDot.y + yr[i];

                if (x >= 0 && x < N && y >= 0 && y < N && !visited[y][x] && map[y][x] == color) {
                    visited[y][x] = true;
                    queue.add(new Dot(x, y));
                }
            }
        }
    }

    public static void checkAreaTwoColor(Dot dot, char color, char color2) {
        Queue<Dot> queue = new LinkedList<>();
        queue.add(dot);
        visited[dot.y][dot.x] = true;

        while (!queue.isEmpty()) {
            Dot qDot = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = qDot.x + xr[i];
                int y = qDot.y + yr[i];

                if (x >= 0 && x < N && y >= 0 && y < N && !visited[y][x] && (map[y][x] == color || map[y][x] == color2)) {
                    visited[y][x] = true;
                    queue.add(new Dot(x, y));
                }
            }
        }
    }
}

class Dot {
    int x;
    int y;

    Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
