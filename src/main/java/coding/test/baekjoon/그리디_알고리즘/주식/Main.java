package coding.test.baekjoon.그리디_알고리즘.주식;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr;
        int T = Integer.parseInt(br.readLine()); //테스트 케이스

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine()); //날의 수
            st = new StringTokenizer(br.readLine());
            arr = new int[N];

            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            long high = 0;
            long benefit = 0;
            for (int k = N - 1; k >= 0; k--) {
                if (arr[k] > high) {
                    high = Math.max(high, arr[k]);
                } else {
                    benefit += (high - arr[k]);
                }
            }

            System.out.println(benefit);
        }
    }
}