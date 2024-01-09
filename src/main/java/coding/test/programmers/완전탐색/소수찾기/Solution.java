package coding.test.programmers.완전탐색.소수찾기;

import java.util.*;

class Solution {

    static boolean[] visit;
    Set<Integer> primeSet;

    public int solution(String numbers) {
        primeSet = new HashSet<>();
        visit = new boolean[numbers.length()];
        dfs("", numbers, 0);

        return primeSet.size();
    }

    public void dfs(String now, String numbers, int length) {
        if (!now.equals("") && isPrime(Integer.parseInt(now))) {
            primeSet.add(Integer.parseInt(now));
        }

        if (length > visit.length) {
            return;
        }

        for (int i = 0; i < visit.length; i++) {
            if (visit[i]) continue;
            visit[i] = true;
            dfs(now + numbers.charAt(i), numbers, length + 1);
            visit[i] = false;
        }
    }

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}