package coding.test.baekjoon.그래프.연결_요소의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 정점의 개수
        M = Integer.parseInt(st.nextToken()); // 간선의 개수

        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = graph[v][u] = true;
        }

        int count = 0;
        for (int i = 1; i < N + 1; i++) {
            if (!visited[i]) {
                BFS(i);
                count++;
            }
        }

        System.out.println(count);
    }

    public static void BFS(int index) {
        Queue<Integer> queue = new LinkedList<>();
        visited[index] = true;
        queue.add(index);

        while (!queue.isEmpty()) {
            int qIndex = queue.poll();

            for (int i = 1; i < N + 1; i++) {
                if (!visited[i] && graph[qIndex][i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

}

