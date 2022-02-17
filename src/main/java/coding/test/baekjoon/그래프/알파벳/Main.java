package coding.test.baekjoon.그래프.알파벳;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] xr = {1, -1, 0, 0};
    static int[] yr = {0, 0, 1, -1};
    static char[][] map;
    static boolean[] visited;
    static int R, C, result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken()); // 세로
        C = Integer.parseInt(st.nextToken()); // 가로

        map = new char[R][C];
        visited = new boolean[26];

        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        BFS(new Dot(0, 0), 1);

        System.out.println(result);
    }

    public static void BFS(Dot dot, int count) {
        visited[map[dot.y][dot.x] - 'A'] = true;
        result = Math.max(result, count);

        for (int i = 0; i < 4; i++) {
            int x = dot.x + xr[i];
            int y = dot.y + yr[i];

            if (x < C && x >= 0 && y < R && y >= 0) {
                if (!visited[map[y][x] - 'A']) {
                    BFS(new Dot(x, y), count + 1);
                    visited[map[y][x] - 'A'] = false;
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