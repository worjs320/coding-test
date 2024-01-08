package coding.test.programmers.완전탐색.모의고사;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        int[] answers1 = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};
        Solution solution = new Solution();
        Assertions.assertEquals(Arrays.asList(1), solution.solution(answers1));
        Assertions.assertEquals(Arrays.asList(1, 2, 3), solution.solution(answers2));
        ;
    }
}