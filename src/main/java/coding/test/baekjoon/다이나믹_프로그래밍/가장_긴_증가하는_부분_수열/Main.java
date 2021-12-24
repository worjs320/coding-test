package coding.test.baekjoon.다이나믹_프로그래밍.가장_긴_증가하는_부분_수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static Integer[] dp;
    static int[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        dp = new Integer[N];
        A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            dpProcess(i);
        }

        int max = 1;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }

    public static int dpProcess(int index) {
        if (dp[index] == null) {
            dp[index] = 1;

            for (int i = index - 1; i >= 0; i--) {
                if (A[i] < A[index]) {
                    dp[index] = Math.max(dp[index], dpProcess(i) + 1);
                }
            }
        }
        return dp[index];
    }
}