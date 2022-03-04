package coding.test.baekjoon.그래프.벽_부수고_이동하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] xr = {1, -1, 0, 0};
    static int[] yr = {0, 0, 1, -1};
    static int N; // 세로
    static int M; // 가로
    static int[][] map;
    static boolean[][][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[2][N][M]; // 0이 벽 안부순거 1이 벽 부순거

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        System.out.println(bfs(new Dot(0, 0, 1, 0)));
    }

    public static int bfs(Dot dot) {
        Queue<Dot> queue = new LinkedList<>();
        queue.add(dot);
        visited[dot.wall][dot.y][dot.x] = true;

        while (!queue.isEmpty()) {
            Dot qDot = queue.poll();

            if (qDot.x == M - 1 && qDot.y == N - 1) {
                return qDot.count;
            }

            for (int i = 0; i < 4; i++) {
                int x = qDot.x + xr[i];
                int y = qDot.y + yr[i];

                if (x >= 0 && x < M && y >= 0 && y < N && !visited[qDot.wall][y][x]) {
                    if (map[y][x] == 1 && qDot.wall < 1) {
                        queue.add(new Dot(x, y, qDot.count + 1, qDot.wall + 1));
                        visited[qDot.wall][y][x] = true;
                    } else if (map[y][x] == 0) {
                        queue.add(new Dot(x, y, qDot.count + 1, 1));
                        visited[qDot.wall][y][x] = true;
                    }
                }
            }
        }

        return -1;
    }
}

class Dot {
    int x, y, count;
    int wall;

    Dot(int x, int y, int count, int wall) {
        this.x = x;
        this.y = y;
        this.count = count;
        this.wall = wall;
    }
}
