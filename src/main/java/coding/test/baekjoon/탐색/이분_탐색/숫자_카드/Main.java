package coding.test.baekjoon.탐색.이분_탐색.숫자_카드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] nList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 상근이가 가지고 있는 숫자 카드 개수
        nList = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nList[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nList);

        int M = Integer.parseInt(br.readLine()); // 상근이가 가지고 있는지 확인해야할 숫자카드 개수

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            sb.append(findCard(Integer.parseInt(st.nextToken()))).append(" ");
        }

        System.out.println(sb);
    }

    public static int findCard(int num) {
        int start = 0;
        int end = nList.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nList[mid] == num) {
                return 1;
            } else if (nList[mid] > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return 0;
    }
}