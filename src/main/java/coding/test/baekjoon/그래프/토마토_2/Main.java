package coding.test.baekjoon.그래프.토마토_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][][] store;
    static int[] xr = {0, 0, 1, -1, 0, 0};
    static int[] yr = {1, -1, 0, 0, 0, 0};
    static int[] hr = {0, 0, 0, 0, 1, -1};
    static int day = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()); // 가로
        int N = Integer.parseInt(st.nextToken()); // 세로
        int H = Integer.parseInt(st.nextToken()); // 높이

        store = new int[H][N][M];

        Queue<Tomato> queue = new LinkedList<>();

        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());
                for (int m = 0; m < M; m++) {
                    int tmp = Integer.parseInt(st.nextToken());
                    store[h][n][m] = tmp;
                    if (tmp == 1) {
                        queue.add(new Tomato(h, n, m));
                    }
                }
            }
        }

        while (!queue.isEmpty()) {
            Tomato tomato = queue.poll();
            for (int i = 0; i < 6; i++) {
                int x = tomato.x + xr[i];
                int y = tomato.y + yr[i];
                int h = tomato.h + hr[i];

                if (h < H && h >= 0 && x < M && x >= 0 && y < N && y >= 0) {
                    if (store[h][y][x] == 0) {
                        queue.add(new Tomato(h, y, x));
                        store[h][y][x] = store[tomato.h][tomato.y][tomato.x] + 1;
                        day = store[h][y][x] - 1;
                    }
                }
            }
        }

        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if (store[h][n][m] == 0) {
                        day = -1;
                        break;
                    }
                }
            }
        }

        System.out.println(day);
    }
}

class Tomato {
    int h;
    int x;
    int y;

    public Tomato(int h, int y, int x) {
        this.h = h;
        this.y = y;
        this.x = x;
    }
}

