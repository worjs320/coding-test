package coding.test.baekjoon.그리디_알고리즘.사과_담기_게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  // 나뉘어진 칸
        int M = Integer.parseInt(st.nextToken());  // 바구니 넓이
        int J = Integer.parseInt(br.readLine());   // 떨어지는 사과의 개수

        int[] locations = new int[J];
        for (int i = 0; i < J; i++) {
            locations[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        int now = 1;

        for (int i = 0; i < J; i++) {
            while (now + M - 1 < locations[i]) {
                count++;
                now++;
            }

            while (now > locations[i]) {
                count++;
                now--;
            }
        }

        System.out.println(count);
    }
}