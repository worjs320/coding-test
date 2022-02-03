package coding.test.baekjoon.그리디_알고리즘.강의실_배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken()); // 시작시간
            int T = Integer.parseInt(st.nextToken()); // 종료시간

            arr[i][0] = S;
            arr[i][1] = T;
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) return o1[1] - o2[1];
            return o1[0] - o2[0];
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(arr[0][1]);

        for (int i = 1; i < N; i++) {
            if (pq.peek() <= arr[i][0]) {
                pq.poll();
            }

            pq.add(arr[i][1]);
        }

        System.out.println(pq.size());
        
//        시간초과
//        int count = 0;
//        for (int i = 0; i < N; i++) {
//            if (!(arr[i][0] == - 1 && arr[i][1] == -1)) count++;
//            for (int j = i + 1; j < N; j++) {
//                if (arr[i][1] <= arr[j][0]) {
//                    arr[j][0] = arr[j][1] = -1;
//                }
//            }
//        }
//        System.out.println(count);
    }
}