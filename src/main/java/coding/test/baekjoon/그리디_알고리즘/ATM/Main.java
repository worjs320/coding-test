package coding.test.baekjoon.그리디_알고리즘.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        ArrayList<Integer> NList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            NList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(NList);

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += NList.get(i);
            for (int j = 0; j < i; j++) {
                result += NList.get(j);
            }
        }

        System.out.println(result);
    }
}