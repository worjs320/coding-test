package coding.test.baekjoon.그리디_알고리즘.스네이크버드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 과일의 개수
        int L = Integer.parseInt(st.nextToken()); // 뱀 길이
        int[] nList = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nList[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nList);

        for (int i = 0; i < N; i++) {
            if (nList[i] <= L) {
                L++;
            } else {
                break;
            }
        }

        System.out.println(L);
    }
}