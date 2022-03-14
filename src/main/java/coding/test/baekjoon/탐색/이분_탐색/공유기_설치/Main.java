package coding.test.baekjoon.탐색.이분_탐색.공유기_설치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 집의 개수
        int C = Integer.parseInt(st.nextToken()); // 공유기 개수

        int[] homes = new int[N];
        for (int i = 0; i < N; i++) {
            homes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(homes);
        long min = 0;
        long max = homes[homes.length - 1];

        while (min <= max) {
            long mid = (min + max) / 2;

            int prev = homes[0];
            int count = 1;
            for (int i = 0; i < N; i++) {
                if (homes[i] - prev >= mid) {
                    prev = homes[i];
                    count++;
                }
            }

            if (count >= C) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        System.out.println(max);
    }
}