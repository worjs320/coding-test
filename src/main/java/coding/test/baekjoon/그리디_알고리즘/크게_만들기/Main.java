package coding.test.baekjoon.그리디_알고리즘.크게_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int rLength = N - K;

        String sNum = br.readLine();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int num = sNum.charAt(i) - '0';

            while (K > 0) {
                if (!stack.isEmpty() && stack.peek() < num) {
                    stack.pop();
                    K--;
                } else {
                    break;
                }
            }
            stack.add(num);
        }

        StringBuilder sb = new StringBuilder();
        if (stack.size() == rLength) {
            for (int i = 0; i < stack.size(); i++) {
                sb.append(stack.get(i));
            }
        } else {
            for (int i = 0; i < rLength; i++) {
                sb.append(stack.get(i));
            }
        }

        System.out.println(sb);
    }
}
