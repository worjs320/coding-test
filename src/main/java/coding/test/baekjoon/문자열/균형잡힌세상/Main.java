package coding.test.baekjoon.문자열.균형잡힌세상;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if (str.equals(".")) {
                break;
            }

            System.out.println(solution(str));
        }
    }

    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        String result = "no";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '[' || c == '(') {
                stack.push(c);
            } else if (c == ']') {
                if (!stack.isEmpty() && stack.peek() == '[' ) {
                    stack.pop();
                } else {
                    return result;
                }
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(' ) {
                    stack.pop();
                } else {
                    return result;
                }
            }
        }

        if (stack.isEmpty()) result = "yes";

        return result;
    }
}
