package coding.test;

import coding.test.programmers.해시.위장.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] closed = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution.solution(closed));
    }
}
