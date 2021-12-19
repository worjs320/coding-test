package coding.test.baekjoon.그래프.DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static boolean graph[][];
    static boolean visited[];
    static int N;
    static int M;
    static int V;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = true;
        }

        DFS(V);
        Arrays.fill(visited, false);
        System.out.println();
        BFS(V);
    }

    static void DFS(int index) {
        visited[index] = true;
        System.out.print(index + " ");

        for (int i = 0; i < N + 1; i++) {
            if (!visited[i] && graph[index][i]) {
                DFS(i);
            }
        }
    }

    static void BFS(int index) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(index);
        visited[index] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int i = 0; i < N + 1; i++) {
                if (!visited[i] && graph[node][i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }

    }
}

