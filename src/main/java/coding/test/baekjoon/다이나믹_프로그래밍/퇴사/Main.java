package coding.test.baekjoon.다이나믹_프로그래밍.퇴사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[] t = new int[n]; // 상담할 때 걸리는 시간
        int[] p = new int[n]; // 비용

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (i + t[i] <= n) {
                dp[i + t[i]] = Math.max(dp[i + t[i]], dp[i] + p[i]);
            }
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
        }

        System.out.println(dp[n]);
    }
}