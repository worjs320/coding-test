package coding.test.baekjoon.탐색.이분_탐색.예산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 국가 수

        int[] nList = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nList[i] = Integer.parseInt(st.nextToken());
        }
        
        int M = Integer.parseInt(br.readLine()); // 총 예산

        Arrays.sort(nList);

        long min = 1;
        long max = nList[nList.length - 1];

        while (min <= max) {
            long mid = (min + max) / 2;

            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (nList[i] <= mid) {
                    sum += nList[i];
                } else {
                    sum += mid;
                }
            }

            if (sum <= M) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        System.out.println(max);
    }
}
