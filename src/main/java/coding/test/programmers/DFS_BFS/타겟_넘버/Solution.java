package coding.test.programmers.DFS_BFS.타겟_넘버;

public class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        bfs(numbers, target, 0, 0);
        return answer;
    }

    public void bfs(int[] numbers, int target, int sum, int i) {
        if (numbers.length == i) {
            if (sum == target) {
                answer += 1;
            }

            return;
        }

        bfs(numbers, target, sum + numbers[i], i+1);
        bfs(numbers, target, sum - numbers[i], i+1);
    }
}
