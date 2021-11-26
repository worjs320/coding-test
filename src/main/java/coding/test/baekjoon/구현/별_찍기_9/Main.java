package coding.test.baekjoon.구현.별_찍기_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int i, j, k;

        for (i = N; i > 0; i--) {
            for (j = i * 2 - 1; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();

            if (i == 1) break;

            for (k = N - i; k >= 0; k--) {
                System.out.print(" ");
            }
        }

        for (i = 2; i <= N; i++) {
            for (k = 0; k < N - i; k++) {
                System.out.print(" ");
            }

            for (j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

