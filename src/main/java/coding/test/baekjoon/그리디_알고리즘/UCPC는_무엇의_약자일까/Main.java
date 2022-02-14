package coding.test.baekjoon.그리디_알고리즘.UCPC는_무엇의_약자일까;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] UCPC = {'U', 'C', 'P', 'C'};

        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == UCPC[index]) {
                index++;
            }

            if (index == 4) {
                System.out.println("I love UCPC");
                return;
            }
        }

        System.out.println("I hate UCPC");
    }
}