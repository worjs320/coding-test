package coding.test.baekjoon.그리디_알고리즘.A와B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder S = new StringBuilder(br.readLine());
        StringBuilder T = new StringBuilder(br.readLine());

        while (S.length() != T.length()) {
            if (T.charAt(T.length() - 1) == 'A') {
                T.delete(T.length() - 1, T.length());
            } else if (T.charAt(T.length() - 1) == 'B') {
                T.delete(T.length() - 1, T.length());
                T.reverse();
            }
        }

        if (S.toString().equals(T.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}