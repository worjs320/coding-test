package coding.test.baekjoon.문자열.단어_뒤집기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

            if (character == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(character);
                flag = true;
            } else if (character == '>') {
                sb.append(character);
                flag = false;
            } else if (flag) {
                sb.append(character);
            } else if (!flag) {
                if (character == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(" ");
                } else {
                    stack.add(character);
                }
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}
