package coding.test.baekjoon.구현.수_이어_쓰기1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = 0;
        int plus = 1;
        int division = 10;
        for (int i = 1; i <= N; i++) {
            if (i % division == 0) {
                plus++;
                division *= 10;
            }
            result += plus;
        }

        System.out.println(result);
    }
}
