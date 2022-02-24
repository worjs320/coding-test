package coding.test.baekjoon.자료_구조.큐.최소_힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) {
                queue.add(num);
            } else {
                int outNum = queue.peek() == null ? 0 : queue.poll();
                sb.append(outNum).append("\n");
            }
        }

        System.out.println(sb);
    }

}