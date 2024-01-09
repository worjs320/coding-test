package coding.test.programmers.기타.공원산책;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();
        String[] input1 = {"OSO","OOO","OXO","OOO"};
        String[] input2 = {"E 2","S 3","W 1"};
        System.out.println(Arrays.toString(solution.solution(input1, input2)));
    }
}