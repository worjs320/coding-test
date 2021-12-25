package coding.test.baekjoon.자료_구조.스택.스택_수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static Stack<Integer> stack = new Stack<>();
    static int[] numList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        numList = new int[n];

        for (int i = 0; i < n; i++) {
            numList[i] = Integer.parseInt(br.readLine());;
        }

        StringBuilder sb = new StringBuilder();

        int numIndex = 0;
        for (int i = 1; i <= n; i++) {
            stack.add(i);
            sb.append("+").append("\n");

            while (!stack.isEmpty()) {
                if (stack.peek() == numList[numIndex]) {
                    stack.pop();
                    sb.append("-").append("\n");
                    numIndex++;
                } else {
                    break;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println(sb.toString());
        } else {
            System.out.println("NO");
        }
    }
}