package coding.test.baekjoon.재귀.하노이_탑_이동_순서;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        solution(N, 1, 2, 3);
        System.out.println(count);
        System.out.println(sb);
    }

    public static void solution(int n, int start, int by, int end) {
        count++;

        if (n == 1) {
            sb.append(start).append(" ").append(end).append("\n");
        } else {
            solution(n - 1, start, end, by);

            sb.append(start).append(" ").append(end).append("\n");

            solution(n - 1, by, start, end);
        }
    }
}
