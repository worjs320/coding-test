package coding.test.programmers.스택_큐.기능_개발;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            int day = 0;
            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                day++;
            }

            if (!q.isEmpty() && q.peek() < day) {
                answerList.add(q.size());
                q.clear();
            }

            q.offer(day);
        }

        answerList.add(q.size());

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}