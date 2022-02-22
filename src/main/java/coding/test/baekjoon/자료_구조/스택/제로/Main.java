package coding.test.baekjoon.자료_구조.스택.제로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            int N = Integer.parseInt(br.readLine());
            if (N != 0) {
                stack.add(N);
            } else {
                stack.pop();
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        System.out.println(result);
    }

}