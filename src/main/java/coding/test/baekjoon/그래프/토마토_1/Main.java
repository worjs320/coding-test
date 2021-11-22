package coding.test.baekjoon.그래프.토마토_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[][] store;
    static int[] xr = {0, 0, 1, -1};
    static int[] yr = {1, -1, 0, 0};
    static int day = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();

        store = new int[H][W];

        Queue<Tomato> queue = new LinkedList<>();

        for (int y = 0; y < H; y++) {
            for (int x = 0; x < W; x++) {
                int tmp = sc.nextInt();
                store[y][x] = tmp;
                if (tmp == 1) {
                    queue.add(new Tomato(y, x));
                }
            }
        }

        while (!queue.isEmpty()) {
            Tomato tomato = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = tomato.x + xr[i];
                int y = tomato.y + yr[i];

                if (x < W && x >= 0 && y < H && y >= 0) {
                    if (store[y][x] == 0) {
                        queue.add(new Tomato(y, x));
                        store[y][x] = store[tomato.y][tomato.x] + 1;
                        day = Math.max(day, store[y][x]) - 1;
                    }
                }
            }
        }

        for (int y = 0; y < H; y++) {
            for (int x = 0; x < W; x++) {
                if (store[y][x] == 0) {
                    day = -1;
                    break;
                }
            }
        }

        System.out.println(day);
    }
}

class Tomato {
    int y;
    int x;

    public Tomato(int y, int x) {
        this.y = y;
        this.x = x;
    }
}

