package coding.test.programmers.해시.위장;

import java.util.HashMap;

public class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            hashMap.put(clothes[i][1], hashMap.getOrDefault(clothes[i][1], 0) + 1);
        }

        int answer = 1;

        for (String key : hashMap.keySet()) {
            answer *= (hashMap.get(key) + 1);
        }

        return answer - 1;
    }
}
