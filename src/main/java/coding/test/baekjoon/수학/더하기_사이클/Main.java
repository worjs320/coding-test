package coding.test.baekjoon.수학.더하기_사이클;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int count = 0;
        int tmp = N;

        do {
            tmp = (tmp % 10 * 10) + ((tmp / 10) + (tmp % 10)) % 10;
            count++;
        } while (N != tmp);

        System.out.println(count);
    }
}

