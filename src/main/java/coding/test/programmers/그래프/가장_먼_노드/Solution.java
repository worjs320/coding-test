package coding.test.programmers.그래프.가장_먼_노드;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int n, int[][] edge) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] e : edge) {
            list.get(e[0]).add(e[1]);
            list.get(e[1]).add(e[0]);
        }

        int[] v = new int[n + 1];

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        v[1] = 1;

        while (!q.isEmpty()) {
            int tmp = q.poll();

            for (int i : list.get(tmp)) {
                if (v[i] == 0) {
                    q.add(i);
                    v[i] = v[tmp] + 1;
                }
            }
        }

        Arrays.sort(v);
        int answer = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (v[i] != v[i + 1]) {
                break;
            }
            answer++;
        }

        return answer;
    }
}