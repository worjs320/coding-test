package coding.test.baekjoon.구현.방_번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] card = new int[10];

        for (char c : N.toCharArray()) {
            if (c == '6') c = '9';
            card[c - 48]++;
        }

        card[9] = (card[9] + 1) / 2;

        Arrays.sort(card);

        System.out.println(card[9]);
    }
}
