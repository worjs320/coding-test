package coding.test.baekjoon.정렬.수_정렬하기_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            numList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(numList);

        StringBuilder sb = new StringBuilder();
        for (int num : numList) {
            sb.append(num).append("\n");
        }

        System.out.print(sb.toString());
    }
}