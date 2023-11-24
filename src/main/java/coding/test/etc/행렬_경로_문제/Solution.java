package coding.test.etc.행렬_경로_문제;

import java.util.Arrays;

public class Solution {
  public int matrixPath(int[][] matrix, int n, int m) {
    if (n == 0 || m == 0) return 0;
    else return matrix[n - 1][m - 1] + Math.max(matrixPath(matrix, n - 1, m), matrixPath(matrix, n, m - 1));
  }

  public int matrixPathV2(int [][] matrix, int n, int m) {
    int[][] dp = new int[n + 1][m + 1];

    for (int i = 0; i < matrix.length; i++) {
      dp[i][0] = 0;
      dp[0][i] = 0;
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        dp[i][j] = matrix[i-1][j-1] + Math.max(dp[i-1][j], dp[i][j-1]);
      }
    }

    return dp[n][m];
  }
}
