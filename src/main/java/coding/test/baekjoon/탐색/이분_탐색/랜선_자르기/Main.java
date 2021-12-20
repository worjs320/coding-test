package coding.test.baekjoon.탐색.이분_탐색.랜선_자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] lanList = new int[K];

        for (int i = 0; i < K; i++) {
            lanList[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(lanList);

        long min = 1;
        long max = lanList[lanList.length - 1];
        while (min <= max) {
            long mid = (max + min) / 2;
            int sum = 0;

            for (int i = 0; i < K; i++) {
                sum += lanList[i] / mid;
            }

            if (sum >= N) {     // 개수가 만족 되는 경우 길이를 늘린다
                min = mid + 1;
            } else {            // 개수가 만족되지 않는 경우 길이를 줄인다
                max = mid - 1;
            }
        }

        System.out.println(max);
    }
}
