package coding.test.baekjoon.그래프.안전_영역;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static int[] xr = {1, -1, 0, 0};
    static int[] yr = {0, 0, 1, -1};
    static int N;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 크기

        map = new int[N][N];
        visited = new boolean[N][N];

        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (int y = 0; y < N; y++) {
            st = new StringTokenizer(br.readLine());
            for (int x = 0; x < N; x++) {
                int num = Integer.parseInt(st.nextToken());
                map[y][x] = num;
                minNum = Math.min(minNum, num);
                maxNum = Math.max(maxNum, num);
            }
        }

        int result = 0;
        for (int i = minNum; i <= maxNum; i++) {
            int count = 0;
            visited = new boolean[N][N];
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < N; x++) {
                    if (map[y][x] > i && !visited[y][x]) {
                        solution(new Dot(x, y), i);
                        count++;
                    }
                }
            }
            result = Math.max(result, count);
        }

        if (result == 0) {
            System.out.println(1);
        } else {
            System.out.println(result);
        }
    }

    public static void solution(Dot dot, int point) {
        Queue<Dot> queue = new LinkedList<>();
        queue.add(dot);
        visited[dot.y][dot.x] = true;

        while (!queue.isEmpty()) {
            Dot qDot = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = qDot.x + xr[i];
                int y = qDot.y + yr[i];

                if (x < N && x >=0 && y < N && y >= 0 && map[y][x] > point && !visited[y][x]) {
                    queue.add(new Dot(x, y));
                    visited[y][x] = true;
                }
            }
        }
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

