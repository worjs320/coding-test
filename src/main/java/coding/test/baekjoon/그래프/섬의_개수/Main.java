package coding.test.baekjoon.그래프.섬의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static int w;
    static int h;
    static int[][] map;
    static boolean[][] visited;
    static int[] wr = {0, 0, 1, -1, 1, 1, -1, -1};
    static int[] hr = {1, -1, 0, 0, 1, -1, 1, -1};

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken()); // 너비
            h = Integer.parseInt(st.nextToken()); // 높이

            if (w == 0 && h == 0) {
                break;
            } else {
                sb.append(getIslandCount()).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static int getIslandCount() throws IOException {
        int count = 0;
        map = new int[h][w];
        visited = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < w; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<Dot> queue = new LinkedList<>();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    count++;
                    queue.add(new Dot(j, i));
                    visited[i][j] = true;
                    while (!queue.isEmpty()) {
                        Dot qDot = queue.poll();

                        for (int k = 0; k < 8; k++) {
                            int qw = qDot.w + wr[k];
                            int qh = qDot.h + hr[k];

                            if (qw < w && qw >= 0 && qh < h && qh >= 0) {
                                if (map[qh][qw] == 1 && !visited[qh][qw]) {
                                    visited[qh][qw] = true;
                                    queue.add(new Dot(qw, qh));
                                }
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}

class Dot {
    int w;
    int h;

    public Dot(int w, int h) {
        this.w = w;
        this.h = h;
    }
}