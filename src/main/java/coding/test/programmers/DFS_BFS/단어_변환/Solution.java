package coding.test.programmers.DFS_BFS.단어_변환;

public class Solution {
    public int answer = 0;
    public boolean[] visit;

    public int solution(String begin, String target, String[] words) {
        visit = new boolean[words.length];
        dfs(begin, target, words, 0);
        return answer;
    }

    public void dfs(String now, String target, String[] words, int count) {
        if (now.equals(target)) {
            answer = count;
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (visit[i]) continue;

            int diffCount = 0;
            for (int j = 0; j < now.length(); j++) {
                if (words[i].charAt(j) != now.charAt(j)) {
                    diffCount += 1;
                }
            }

            if (diffCount == 1) {
                visit[i] = true;
                dfs(words[i], target, words, count + 1);
                visit[i] = false;
            }
        }
    }
}
