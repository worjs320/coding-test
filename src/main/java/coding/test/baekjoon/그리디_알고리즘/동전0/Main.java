package coding.test.baekjoon.그리디_알고리즘.동전0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coinList = new int[N];

        for (int i = 0 ; i < N; i++) {
            coinList[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;

        do {
            for (int i = N - 1; i >= 0; i--) {
                if (K >= coinList[i]) {
                    K -= coinList[i];
                    count++;
                    break;
                }
            }
        } while (K != 0);

        System.out.println(count);
    }
}