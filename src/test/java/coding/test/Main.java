package coding.test;

import coding.test.programmers.그래프.가장_먼_노드.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 6;
        int[][] vertex = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        System.out.println(solution.solution(n, vertex));
    }
}
