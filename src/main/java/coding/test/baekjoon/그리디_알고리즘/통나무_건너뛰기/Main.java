package coding.test.baekjoon.그리디_알고리즘.통나무_건너뛰기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine()); //테스트 케이스 개수

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine()); //통나무의 개수
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                queue.add(Integer.parseInt(st.nextToken()));
            }

            sb.append(solution(queue));
            if (i != T - 1) sb.append("\n");
        }

        System.out.println(sb);
    }

    public static int solution(PriorityQueue<Integer> queue) {
        int[] arr = new int[queue.size()];
        int left = 0;
        int right = queue.size() - 1;
        int index = 0;

        while (!queue.isEmpty()) {
            if (index % 2 == 0) {
                arr[left++] = queue.poll();
            } else {
                arr[right--] = queue.poll();
            }
            index++;
        }

        int result = 0;
        result = Math.max(result, Math.abs(arr[arr.length - 1] - arr[0]));
        for (int i = 0; i < arr.length - 1; i++) {
            result = Math.max(result, Math.abs(arr[i + 1] - arr[i]));
        }

        return result;
    }
}
