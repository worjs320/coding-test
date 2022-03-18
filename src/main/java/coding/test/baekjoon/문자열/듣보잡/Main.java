package coding.test.baekjoon.문자열.듣보잡;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> nSet = new HashSet<>();
        ArrayList<String> resultList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            nSet.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if (nSet.contains(s)) {
                resultList.add(s);
            }
        }

        Collections.sort(resultList);

        System.out.println(resultList.size());

        for (String s: resultList) {
            System.out.println(s);
        }
    }
}
