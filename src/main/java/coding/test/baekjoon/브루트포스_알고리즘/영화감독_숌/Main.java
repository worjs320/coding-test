package coding.test.baekjoon.브루트포스_알고리즘.영화감독_숌;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 1;
        int movieNum = 666;

        while (N != count) {
            movieNum++;
            if (Integer.toString(movieNum).contains("666")) {
                count++;
            }
        }

        System.out.println(movieNum);
    }
}



