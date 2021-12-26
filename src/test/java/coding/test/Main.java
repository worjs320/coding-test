package coding.test;

import coding.test.programmers.탐욕법.체육복.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(solution.solution(5, lost, reserve));
    }
}
