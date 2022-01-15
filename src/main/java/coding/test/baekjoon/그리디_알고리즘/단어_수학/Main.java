package coding.test.baekjoon.그리디_알고리즘.단어_수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] NList = new Integer[26];
        Arrays.fill(NList, 0);

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            char[] cArr = word.toCharArray();
            int cArrLength = cArr.length;
            for (int j = 0; j < cArrLength; j++) {
                NList[cArr[j] - 'A'] += (int) Math.pow(10, cArrLength - j - 1);
            }
        }

        Arrays.sort(NList, Comparator.reverseOrder());

        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += NList[i] * (9 - i);
        }

//        System.out.println(Arrays.toString(NList));
        System.out.println(result);
    }
}