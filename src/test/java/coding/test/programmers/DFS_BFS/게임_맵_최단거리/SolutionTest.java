package coding.test.programmers.DFS_BFS.게임_맵_최단거리;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        Solution solution = new Solution();
        System.out.println(solution.solution(maps));
    }
}