package coding.test;

import coding.test.programmers.스택_큐.기능_개발.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(solution.solution(progresses, speeds)));
    }
}
