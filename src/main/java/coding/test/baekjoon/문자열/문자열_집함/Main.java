package coding.test.baekjoon.문자열.문자열_집함;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] sArr = new String[N];

        for (int i = 0; i < N; i++) {
            sArr[i] = br.readLine();
        }

        int count = 0;
        for (int i = 0; i < M; i++) {
            String temp = br.readLine();
            for (int j = 0; j < N; j++) {
                if (sArr[j].equals(temp)) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
