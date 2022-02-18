package coding.test.baekjoon.자료_구조.큐.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static Deque<Integer> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }
        }

        System.out.println(sb);
    }

    public static void push(int val) {
        queue.add(val);
    }

    public static void pop() {
        int result = -1;
        if (!queue.isEmpty()) {
            result = queue.pop();
        }
        sb.append(result).append("\n");
    }

    public static void size() {
        sb.append(queue.size()).append("\n");
    }

    public static void empty() {
        sb.append(queue.isEmpty() ? "1" : "0").append("\n");
    }

    public static void front() {
        int result = -1;
        if (!queue.isEmpty()) {
            result = queue.peekFirst();
        }
        sb.append(result).append("\n");
    }

    public static void back() {
        int result = -1;
        if (!queue.isEmpty()) {
            result = queue.peekLast();
        }
        sb.append(result).append("\n");
    }
}
