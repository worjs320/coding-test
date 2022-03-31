package coding.test.baekjoon.그리디_알고리즘.알바생_강호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> nList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            nList.add(Integer.parseInt(br.readLine()));
        }

        nList.sort(Collections.reverseOrder());

        long result = 0;
        for (int i = 0; i < N; i++) {
            int tip = nList.get(i) - (i + 1 - 1);
            if (tip > 0) result += tip;
        }

        System.out.println(result);
    }
}