package coding.test.baekjoon.그리디_알고리즘.카드_합체_놀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());  // 카드 개수
        int m = Integer.parseInt(st.nextToken());  // 카드를 합칠 횟수

        long[] cards = new long[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            Arrays.sort(cards);
            long sum = cards[0] + cards[1];
            cards[0] = cards[1] = sum;
        }

        long result = 0;
        for (long card : cards) {
            result += card;
        }

        System.out.println(result);
    }
}