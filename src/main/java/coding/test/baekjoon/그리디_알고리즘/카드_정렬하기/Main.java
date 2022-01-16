package coding.test.baekjoon.그리디_알고리즘.카드_정렬하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            queue.add(x);
        }

        int result = 0;
        while (queue.size() > 1) {
            int sum = queue.poll() + queue.poll();
            result += sum;
            queue.add(sum);
        }

        System.out.println(result);
    }
}