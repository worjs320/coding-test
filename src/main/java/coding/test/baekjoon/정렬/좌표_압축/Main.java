package coding.test.baekjoon.정렬.좌표_압축;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] orgArr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = orgArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        Map<Integer, Integer> map = new HashMap<>();
        int value = 0;
        map.put(arr[0], value);
        for (int i = 1; i < N; i++) {
            if (arr[i - 1] != arr[i]) {
                value++;
            }
            map.put(arr[i], value);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(map.get(orgArr[i])).append(" ");
        }

        System.out.println(sb);
    }
}
