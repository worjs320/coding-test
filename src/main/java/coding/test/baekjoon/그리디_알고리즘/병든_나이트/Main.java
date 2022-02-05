package coding.test.baekjoon.그리디_알고리즘.병든_나이트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 세로
        int M = Integer.parseInt(st.nextToken()); // 가로

        if (N == 1) {
            System.out.println(1);
        } else if (N == 2) {
            System.out.println(Math.min(4, (M + 1) / 2));
        } else if (M < 7) {
            System.out.println(Math.min(4, M));
        } else {
            System.out.println(M - 2);
        }
    }
}