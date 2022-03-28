package coding.test.baekjoon.그리디_알고리즘.이장님_초대;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> nList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(nList);

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, nList.get(i) - i);
        }

        System.out.println(max + N + 1);
    }
}