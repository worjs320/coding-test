package coding.test.etc.행렬_경로_문제;

class SolutionTest {

  public static void main(String[] args) {
    int[][] matrix = {
        {6, 7, 12, 5},
        {5, 3, 11, 18},
        {7, 17, 3, 3},
        {8, 10, 14, 9},
    };

    Solution solution = new Solution();
    System.out.println(solution.matrixPath(matrix, 4, 4));
    System.out.println(solution.matrixPathV2(matrix, 4, 4));
  }
}
