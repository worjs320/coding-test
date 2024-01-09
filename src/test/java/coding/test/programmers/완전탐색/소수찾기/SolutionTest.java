package coding.test.programmers.완전탐색.소수찾기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        String input1 = "17";
        String input2 = "011";
        Solution solution = new Solution();
        assertEquals(3, solution.solution(input1));
        assertEquals(2, solution.solution(input2));
    }
}