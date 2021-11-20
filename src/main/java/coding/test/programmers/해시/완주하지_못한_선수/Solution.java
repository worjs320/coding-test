package coding.test.programmers.해시.완주하지_못한_선수;


import java.util.Arrays;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                answer = participant[i];
                break;
            }

            if (i == completion.length - 1) {
                answer = participant[participant.length -1];
            }
        }
        return answer;
    }
}