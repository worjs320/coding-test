package coding.test.baekjoon.그리디_알고리즘.게임을_만든_동준이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];

        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = N - 1; i > 0; i--) {
            if (scores[i] <= scores[i - 1]) {
                while (scores[i] <= scores[i - 1]) {
                    scores[i - 1]--;
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}