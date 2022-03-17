package coding.test.baekjoon.문자열.크로아티아_알파벳;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] word = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String input = br.readLine().trim();

        for (String s : word) {
            if (input.contains(s)) {
                input = input.replaceAll(s, ".");
            }
        }

        System.out.println(input.length());
    }
}
