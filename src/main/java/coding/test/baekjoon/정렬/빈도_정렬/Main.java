package coding.test.baekjoon.정렬.빈도_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
//        int C = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> numMap = new LinkedHashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(numMap.keySet());
        list.sort((o1, o2) -> numMap.get(o2) - numMap.get(o1));

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < numMap.get(list.get(i)); j++) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}