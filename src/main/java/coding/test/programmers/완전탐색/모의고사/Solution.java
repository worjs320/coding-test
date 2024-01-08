package coding.test.programmers.완전탐색.모의고사;

import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i%5]) scores[0]++;
            if (answers[i] == two[i%8]) scores[1]++;
            if (answers[i] == three[i%10]) scores[2]++;
        }

        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        ArrayList<Integer> maxList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            if (scores[i] == max) maxList.add(i + 1);
        }

        return maxList;
    }
}