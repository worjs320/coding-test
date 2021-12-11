package coding.test.baekjoon.수학.한수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            if (i < 100) {
                count++;
            } else if (i < 1000) {
                String tmp = Integer.toString(i);
                int one = Integer.parseInt(Character.toString(tmp.charAt(0)));
                int two = Integer.parseInt(Character.toString(tmp.charAt(1)));
                int three = Integer.parseInt(Character.toString(tmp.charAt(2)));
                if (one - two == two - three) {
                    count++;
                }
            }

        }

        System.out.println(count);
    }

}



