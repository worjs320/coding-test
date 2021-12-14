package coding.test.baekjoon.다이나믹_프로그래밍.피보나치_함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static Integer[][] fibonacciList = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        fibonacciList[0][0] = 1;
        fibonacciList[0][1] = 0;
        fibonacciList[1][0] = 0;
        fibonacciList[1][1] = 1;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            fibonacci(N);
            System.out.println(fibonacciList[N][0] + " " + fibonacciList[N][1]);
        }
    }

    public static Integer[] fibonacci(int n) {
        if (fibonacciList[n][0] == null) {
            fibonacciList[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
        }

        if (fibonacciList[n][1] == null) {
            fibonacciList[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
        }

        return fibonacciList[n];
    }
}