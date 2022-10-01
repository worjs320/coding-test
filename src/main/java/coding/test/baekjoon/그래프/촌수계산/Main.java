package coding.test.baekjoon.그래프.촌수계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int n;
    private static int[][] graph;
    private static int[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); //전체 사람의 수

        st = new StringTokenizer(br.readLine());
        graph = new int[n + 1][n + 1];
        visit = new int[n + 1];
        int relation1 = Integer.parseInt(st.nextToken());
        int relation2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()); //관계의 수

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        BFS(relation1, relation2);
        if (visit[relation2] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(visit[relation2]);
        }
    }

    static void BFS(int start, int end) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int now = q.poll();

            if (now == end) {
                break;
            }

            for (int i = 1; i <= n; i++) {
                if (visit[i] == 0 && graph[now][i] == 1) {
                    visit[i] = visit[now] + 1;
                    q.add(i);
                }
            }
        }
    }
}

