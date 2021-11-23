package coding.test;

import coding.test.programmers.DFS_BFS.타겟_넘버.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] number = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution.solution(number, target));
    }
}
