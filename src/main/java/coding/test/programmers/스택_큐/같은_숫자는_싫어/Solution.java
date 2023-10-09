package coding.test.programmers.스택_큐.같은_숫자는_싫어;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> queue = new Stack();

        queue.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (!(queue.peek() == arr[i])) {
                queue.add(arr[i]);
            }
        }

        int[] answer = new int[queue.size()];

        int index = queue.size();
        while(!queue.isEmpty()) {
            answer[queue.size()-1] = queue.pop();
            index++;
        }

        return answer;
    }
}