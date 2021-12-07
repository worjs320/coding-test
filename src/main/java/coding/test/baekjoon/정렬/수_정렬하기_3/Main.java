package coding.test.baekjoon.정렬.수_정렬하기_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] numList = new int[10001];

        for (int i = 0; i < N; i++) {
            numList[Integer.parseInt(br.readLine())]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10001; i++) {
            while (numList[i] > 0) {
                numList[i]--;
                sb.append(i).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}