package coding.test.baekjoon.그래프.숨바꼭질;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int K;
    static int[] visitedCount = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        Arrays.fill(visitedCount, -1);
        System.out.println(BFS(N));
    }

    public static int BFS(int N) {
        visitedCount[N] += 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);

        while (!queue.isEmpty()) {
            int now = queue.poll();

            if (now == K) {
                return visitedCount[now];
            }

            int val = now + 1;
            if (val <= visitedCount.length - 1 && val >= 0 && visitedCount[val] < 0) {
                visitedCount[val] = visitedCount[now] + 1;
                queue.add(val);
            }

            val = now - 1;
            if (val <= visitedCount.length - 1 && val >= 0 && visitedCount[val] < 0) {
                visitedCount[val] = visitedCount[now] + 1;
                queue.add(val);
            }

            val = now * 2;
            if (val <= visitedCount.length - 1 && val >= 0 && visitedCount[val] < 0) {
                visitedCount[val] = visitedCount[now] + 1;
                queue.add(val);
            }
        }
        return 0;
    }
}