package coding.test.baekjoon.그리디_알고리즘.수리공_항승;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 새는곳 개수
        int L = Integer.parseInt(st.nextToken()); // 테이프 길이

        int[] tape = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tape[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(tape);

        int cur = tape[0];
        int count = 1;
        for (int i = 0; i < N; i++) {
            if (cur + L <= tape[i]) {
                count++;
                cur = tape[i];
            }
        }

        System.out.println(count);
    }
}