package coding.test.baekjoon.구현.통계학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        ArrayList<Integer> numList = new ArrayList<>();
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        int allAddScore = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            numList.add(num);

            allAddScore += num;
            if (num > maxNum) {
                maxNum = num;
            }

            if (num < minNum) {
                minNum = num;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append((int) Math.round((double) allAddScore / N)).append("\n");
        Collections.sort(numList);
        sb.append(numList.get(numList.size() / 2)).append("\n");

        Map<Integer, Integer> modeMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (modeMap.containsKey(numList.get(i))) {
                modeMap.put(numList.get(i), modeMap.get(numList.get(i)) + 1);
            } else {
                modeMap.put(numList.get(i), 1);
            }
        }

        int maxValue = Collections.max(modeMap.values());
        ArrayList<Integer> modeList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> m : modeMap.entrySet()) {
            if (m.getValue() == maxValue) {
                modeList.add(m.getKey());
            }
        }

        Collections.sort(modeList);
        if (modeList.size() > 1)
            sb.append(modeList.get(1)).append("\n");
        else
            sb.append(modeList.get(0)).append("\n");

        sb.append(maxNum - minNum).append("\n");

        System.out.print(sb.toString());
    }
}
