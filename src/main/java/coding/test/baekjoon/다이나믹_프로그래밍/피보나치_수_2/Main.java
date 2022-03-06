package coding.test.baekjoon.다이나믹_프로그래밍.피보나치_수_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static Long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dp = new Long[91];

        int n = Integer.parseInt(br.readLine());

        dp[0] = 0L;
        dp[1] = 1L;
        System.out.println(dp(n));
    }

    public static Long dp(int n) {
        if (dp[n] == null) {
            dp[n] = dp(n - 1) + dp(n - 2);
        }
        return dp[n];
    }
}