package coding.test.baekjoon.구현.AC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String p = br.readLine();
            br.readLine();
            String xString = br.readLine();

            st = new StringTokenizer(xString, "[,]");
            ArrayDeque<Integer> x = new ArrayDeque<>();
            while (st.hasMoreTokens()) {
                x.add(Integer.parseInt(st.nextToken()));
            }

            sb.append(solution(p, x)).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static String solution(String p, ArrayDeque<Integer> x) {
        String result;
        boolean reverse = false;
        try {
            for (int i = 0; i < p.length(); i++) {
                switch (p.charAt(i)) {
                    case 'R':
                        reverse = !reverse;
                        break;
                    case 'D':
                        if (reverse) {
                            x.removeLast();
                        } else {
                            x.removeFirst();
                        }
                }
            }
            if (reverse) {
                x = R(x);
            }
            result = x.toString().replaceAll(" ", "");
        } catch (Exception e) {
            result = "error";
        }

        return result;
    }

    public static ArrayDeque<Integer> R(ArrayDeque<Integer> list) {
        ArrayDeque<Integer> resultList = new ArrayDeque<>();
        for (int i = list.size(); i > 0; i--) {
            resultList.add(list.pollLast());
        }
        return resultList;
    }
}
