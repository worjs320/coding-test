package coding.test.baekjoon.그리디_알고리즘.주유소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        long[] cites = new long[N];
        long[] distances = new long[N - 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < distances.length; i++) {
            distances[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cites.length; i++) {
            cites[i] = Long.parseLong(st.nextToken());
        }

        long distance = 0;
        long minCity = cites[0];

        // 내림차순일 때만 곱해주면 된다.
        for (int i = 0; i < distances.length; i++) {
            if (cites[i] < minCity) {
                distance += cites[i] * distances[i];
                minCity = cites[i];
            } else {
                distance += minCity * distances[i];
            }
        }

        System.out.println(distance);
    }
}