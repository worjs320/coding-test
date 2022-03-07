package coding.test.baekjoon.탐색.이분_탐색.나무_자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 나무의 수
        int M = Integer.parseInt(st.nextToken()); // 가져가야 하는 나무의 길이

        int[] trees = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(trees);
        long min = 0;
        long max = trees[trees.length - 1];

        while (max >= min) {
            long mid = (max + min) / 2;

            long result = 0;
            for (int i = 0; i < N; i++) {
                if (trees[i] - mid > 0) {
                    result += trees[i] - mid;
                }
            }

            if (result < M) { // 너무 많이 잘랐을 경우
                max = mid - 1;
            } else {          // 덜 잘랐을 경우
                min = mid + 1;
            }
        }

        System.out.println(max);
    }
}