package coding.test.baekjoon.그래프.단지번호붙이기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[][] maze;
    static int[] xr = {0, 0, 1, -1};
    static int[] yr = {1, -1, 0, 0};
    static boolean[][] visited;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        maze = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        ArrayList<Integer> complexCount = new ArrayList<>();
        int totalCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (maze[i][j] == 1 && !visited[i][j]) {
                    totalCount++;
                    complexCount.add(checkComplex(new Dot(j, i)));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(totalCount).append("\n");

        Collections.sort(complexCount);
        for (int count: complexCount) {
            sb.append(count).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int checkComplex(Dot dot) {
        Queue<Dot> queue = new LinkedList<>();
        queue.add(dot);
        visited[dot.y][dot.x] = true;
        int count = 1;

        while (!queue.isEmpty()) {
            Dot qDot = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = qDot.x + xr[i];
                int y = qDot.y + yr[i];

                if (x < N && 0 <= x && y < N && 0 <= y) {
                    if (maze[y][x] == 1) {
                        if (visited[y][x]) continue;
                        visited[y][x] = true;
                        queue.add(new Dot(x, y));
                        count += 1;
                    }
                }
            }
        }
        return count;
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