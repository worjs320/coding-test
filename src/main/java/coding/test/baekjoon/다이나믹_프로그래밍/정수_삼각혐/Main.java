package coding.test.baekjoon.다이나믹_프로그래밍.정수_삼각혐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int[][] dp;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = arr[n - 1][i];
        }

        System.out.println(find(0, 0));
    }

    public static int find(int index, int depth) {
        if (depth == n) return dp[0][0];

        if (dp[depth][index] == 0) {
            dp[depth][index] = Math.max(find(index, depth + 1), find(index + 1, depth + 1)) + arr[depth][index];
        }

        return dp[depth][index];
    }
}



