package coding.test;

import coding.test.programmers.해시.완주하지_못한_선수.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution.solution(participant, completion));
    }
}
