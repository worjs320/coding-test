package coding.test;

import coding.test.programmers.해시.완주하지_못한_선수.Solution;
import coding.test.programmers.해시.완주하지_못한_선수.Solution2;

public class Main {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution.solution(participant, completion));
    }
}
