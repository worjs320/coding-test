package coding.test.baekjoon.그리디_알고리즘.수들의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());

        int N = 0;
        while (S != 0) {
            if (S <= N) break;
            N++;
            S -= N;
        }

        System.out.println(N);
    }
}