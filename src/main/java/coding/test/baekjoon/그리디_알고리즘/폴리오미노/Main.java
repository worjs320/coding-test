package coding.test.baekjoon.그리디_알고리즘.폴리오미노;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        s = s.replaceAll("XXXX", "AAAA");
        s = s.replaceAll("XX", "BB");

        if (s.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(s);
        }

    }
}
