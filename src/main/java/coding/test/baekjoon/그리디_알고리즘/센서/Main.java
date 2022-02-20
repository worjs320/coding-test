package coding.test.baekjoon.그리디_알고리즘.센서;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 센서 개수
        int K = Integer.parseInt(br.readLine()); // 집중국의 개수

        int[] sensors = new int[N];
        int[] diff = new int[N - 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sensors[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sensors);

        for (int i = 1; i < N; i++) {
            diff[i - 1] = sensors[i] - sensors[i - 1];
        }

        Arrays.sort(diff);

        int result = 0;
        if (N != K) {
            for (int i = 0; i < N - K; i++) {
                result += diff[i];
            }
        }

        System.out.print(result);
    }
}

