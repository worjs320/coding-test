package coding.test.baekjoon.그리디_알고리즘.삼십;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] NList = br.readLine().toCharArray();

        int totalCount = 0;
        int minCount = Integer.MAX_VALUE;
        for (char value : NList) {
            totalCount += Integer.parseInt(String.valueOf(value));
            minCount = Math.min(minCount, Integer.parseInt(String.valueOf(value)));
        }

        if (totalCount % 3 == 0 && minCount == 0) {
            Arrays.sort(NList);
            StringBuilder sb = new StringBuilder();
            for (int i = NList.length - 1; i >= 0; i--) {
                sb.append(NList[i]);
            }
            System.out.println(sb.toString());
        } else {
            System.out.println(-1);
        }
    }
}