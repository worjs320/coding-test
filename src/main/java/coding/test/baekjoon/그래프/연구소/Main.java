package coding.test.baekjoon.그래프.연구소;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int[][] map;
    public static int[][] copy_map;
    public static int[][] spread_map;
    public static int N, M;
    public static int[] xr = {-1, 0, 1, 0};
    public static int[] yr = {0, -1, 0, 1};
    public static int ans = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        copy_map = new int[N][M];
        spread_map = new int[N][M];

        for (int y = 0; y < N; y++) {
            st = new StringTokenizer(br.readLine());
            for (int x = 0; x < M; x++) {
                map[y][x] = Integer.parseInt(st.nextToken());
                copy_map[y][x] = map[y][x];
            }
        }

        makeWall(0);

        System.out.println(ans);
    }

    public static void makeWall(int cnt) {
        if (cnt == 3) {
            spreadVirus();
            countZero();
            return;
        }

        for (int y = 0; y < N; y++) {
            for (int x = 0; x < M; x++) {
                if (copy_map[y][x] == 0) {
                    copy_map[y][x] = 1;
                    makeWall(cnt + 1);
                    copy_map[y][x] = 0;
                }
            }
        }
    }

    public static void spreadVirus() {
        Queue<Dot> queue = new LinkedList<>();

        for (int y = 0; y < N; y++) {
            for (int x = 0; x < M; x++) {
                spread_map[y][x] = copy_map[y][x];
                if (spread_map[y][x] == 2) {
                    queue.add(new Dot(x, y));
                }
            }
        }

        while (!queue.isEmpty()) {
            Dot qDot = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = qDot.x + xr[i];
                int y = qDot.y + yr[i];

                if (x >= 0 && y >= 0 && x < M && y < N) {
                    if (spread_map[y][x] == 0) {
                        spread_map[y][x] = 2;
                        queue.add(new Dot(x, y));
                    }
                }
            }
        }
    }

    public static void countZero() {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (spread_map[i][j] == 0) {
                    count++;
                }
            }
        }
        ans = Math.max(ans, count);
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