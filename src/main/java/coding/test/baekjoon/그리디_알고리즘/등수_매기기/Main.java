package coding.test.baekjoon.그리디_알고리즘.등수_매기기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        long result = 0;
        for (int i = 0; i < N; i++) {
            result += Math.abs((i + 1) - arr[i]);
        }

        System.out.println(result);
    }
}