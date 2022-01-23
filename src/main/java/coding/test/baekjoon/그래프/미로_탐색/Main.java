package coding.test.baekjoon.그래프.미로_탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] maze;
    static int[] xr = {0, 0, 1, -1};
    static int[] yr = {1, -1, 0, 0};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        maze = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        Queue<Dot> queue = new LinkedList<>();
        queue.add(new Dot(0, 0));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Dot dot = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = dot.x + xr[i];
                int y = dot.y + yr[i];

                if (x < M && 0 <= x && y < N && 0 <= y) {
                    if (visited[y][x]) continue;
                    if (maze[y][x] == 1) {
                        queue.add(new Dot(x, y));
                        maze[y][x] = maze[dot.y][dot.x] + 1;
                    }
                }
            }
        }

        System.out.println(maze[N - 1][M - 1]);
    }
}

class Dot {
    int x;
    int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

