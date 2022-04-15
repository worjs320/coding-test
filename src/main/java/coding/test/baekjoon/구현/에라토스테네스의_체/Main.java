package coding.test.baekjoon.구현.에라토스테네스의_체;

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
        boolean[] primeNum = new boolean[N + 1];

        int count = 0;
        for (int i = 2; i <= N; i++) {
            for (int j = i; j <= N; j += i) {
                if (primeNum[j]) continue;
                primeNum[j] = true;
                count++;
                if (count == K) {
                    System.out.println(j);
                }
            }
        }
    }
}
