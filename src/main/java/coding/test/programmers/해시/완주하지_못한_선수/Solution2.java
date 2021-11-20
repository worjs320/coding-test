package coding.test.programmers.해시.완주하지_못한_선수;

import java.util.HashMap;

public class Solution2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> players = new HashMap();
        for (String player: participant) players.put(player, players.getOrDefault(player, 0) + 1);
        for (String player: completion) players.put(player, players.getOrDefault(player, 0) - 1);

        for (HashMap.Entry<String, Integer> entry : players.entrySet()) {
            String key = entry.getKey();
            int value =  entry.getValue();
            if (value > 0) answer = key;
        }
        return answer;
    }
}