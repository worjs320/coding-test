package coding.test.baekjoon.그래프.유기농_배추;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph;
    static int[] xr = {0, 0, 1, -1};
    static int[] yr = {1, -1, 0, 0};
    static boolean[][] visited;
    static int M;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            int count = 0;
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); //가로
            N = Integer.parseInt(st.nextToken()); //세로
            int K = Integer.parseInt(st.nextToken());

            graph = new int[N][M];
            visited = new boolean[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[y][x] = 1;
            }

            for (int k = 0; k < N; k++) {
                for (int l = 0; l < M; l++) {
                    if (!visited[k][l] && graph[k][l] == 1) {
                        Dot dot = new Dot(l, k);
                        BFS(dot);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    static void BFS(Dot dot) {
        Queue<Dot> queue = new LinkedList<>();
        visited[dot.y][dot.x] = true;
        queue.add(dot);

        while (!queue.isEmpty()) {
            Dot qDot = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = qDot.x + xr[i];
                int y = qDot.y + yr[i];
                if (x < M && x >= 0 && y < N && y >= 0) {
                    if (!visited[y][x] && graph[y][x] == 1) {
                        visited[y][x] = true;
                        queue.add(new Dot(x, y));
                    }
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



