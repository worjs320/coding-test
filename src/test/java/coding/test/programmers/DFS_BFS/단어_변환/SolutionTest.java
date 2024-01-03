package coding.test.programmers.DFS_BFS.단어_변환;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        Solution solution = new Solution();
        System.out.println(solution.solution(begin, target, words));
    }
}