package coding.test.programmers.탐욕법.체육복;


public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    reserve[i] = lost[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        for (int i = 0; i < reserve.length; i++) {
            if (answer == n) break;
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] - lost[j] == -1 || reserve[i] - lost[j] == 1) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}