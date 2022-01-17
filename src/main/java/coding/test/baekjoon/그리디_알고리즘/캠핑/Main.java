package coding.test.baekjoon.그리디_알고리즘.캠핑;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int caseCount = 1;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if (L == 0 && P == 0 && V == 0) {
                break;
            }

            System.out.println(solution(L, P, V, caseCount));
            caseCount++;
        }
    }

    public static String solution(int L, int P, int V, int caseCount) {
        int result = L * (V / P) + Math.min(V % P, L);
        StringBuilder sb = new StringBuilder();
        sb.append("Case ").append(caseCount).append(": ").append(result);
        return sb.toString();
    }
}