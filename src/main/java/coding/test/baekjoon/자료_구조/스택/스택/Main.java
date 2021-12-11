package coding.test.baekjoon.자료_구조.스택.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String method = st.nextToken();
            switch (method) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    System.out.println(pop());
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
                case "top":
                    System.out.println(top());
                    break;
            }
        }
    }

    public static void push(int X) {
        stack.push(X);
    }

    public static int pop() {
        int result = -1;
        if (!stack.empty()) {
            result = stack.pop();
        }
        return result;
    }

    public static int size() {
        return stack.size();
    }

    public static int empty() {
        int result = 0;
        if (stack.empty()) {
            result = 1;
        }
        return result;
    }

    public static int top() {
        int result = -1;
        if (!stack.empty()) {
            result = stack.peek();
        }
        return result;
    }
}