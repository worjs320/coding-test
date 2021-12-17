package coding.test.baekjoon.자료_구조.스택.괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            stack.clear();
            String brackets = br.readLine();
            for (int j = 0; j < brackets.length(); j++) {
                char bracket = brackets.charAt(j);

                if (bracket == '(') {
                    stack.push(bracket);
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        System.out.println("NO");
                        break;
                    }
                }

                if (j == brackets.length() - 1) {
                    if (stack.isEmpty()) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}