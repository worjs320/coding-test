package coding.test.baekjoon.그래프.나이트의_이동;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] map;
    static int[] xr = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] yr = {2, 1, -1, -2, -2, -1, 1, 2};
    static boolean[][] visited;
    static Dot start;
    static Dot destination;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < K; i++) {
            N = Integer.parseInt(br.readLine());
            map = new int[N][N];
            visited = new boolean[N][N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            start = new Dot(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
            st = new StringTokenizer(br.readLine());
            destination = new Dot(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            sb.append(bfs()).append("\n");
        }

        System.out.println(sb);
    }

    public static int bfs() {
        Queue<Dot> queue = new LinkedList<>();
        queue.add(start);
        visited[start.y][start.x] = true;

        while (!queue.isEmpty()) {
            Dot dot = queue.poll();

            if (dot.x == destination.x && dot.y == destination.y) return dot.count;

            for (int i = 0; i < 8; i++) {
                int x = dot.x + xr[i];
                int y = dot.y + yr[i];

                if (x < N && x >= 0 && y < N && y >= 0 && !visited[y][x]) {
                    queue.add(new Dot(x, y, dot.count + 1));
                    visited[y][x] = true;
                }
            }
        }

        return 0;
    }
}

class Dot {
    int x;
    int y;
    int count;

    public Dot(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}