package coding.test.baekjoon.수학.평균은_넘겠지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken());
        int[] scoreList;

        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine());

            int tCount = st.countTokens();
            double personCount = Integer.parseInt(st.nextToken());
            int totalSum = 0;

            scoreList = new int[tCount - 1];

            for (int j = 0; j < tCount - 1; j++) {
                scoreList[j] = Integer.parseInt(st.nextToken());
                totalSum += scoreList[j];
            }

            double average = (double) totalSum / personCount;
            double underPerson = 0;

            for (int score : scoreList) {
                if (average < score) {
                    underPerson += 1;
                }
            }

            System.out.printf("%.3f%s%n", Math.round((underPerson / personCount) * 100000) / 1000.0, "%");
        }
    }
}



