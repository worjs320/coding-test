package coding.test.baekjoon.다이나믹_프로그래밍.계단_오르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] dp;
    static int[] steps;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        steps = new int[n + 1];
        dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            steps[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = steps[1];
        if (n > 1) {
            dp[2] = steps[1] + steps[2];
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + steps[i - 1]) + steps[i];
        }

        System.out.println(dp[n]);
    }
}