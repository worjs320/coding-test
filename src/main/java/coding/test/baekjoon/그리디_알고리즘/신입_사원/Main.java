package coding.test.baekjoon.그리디_알고리즘.신입_사원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int[][] grade;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            grade = new int[N][2];
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                grade[j][0] = Integer.parseInt(st.nextToken());
                grade[j][1] = Integer.parseInt(st.nextToken());
            }

            sb.append(getMaxNewcomerCount(grade)).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int getMaxNewcomerCount(int[][] grade) {
        Arrays.sort(grade, Comparator.comparingInt(p -> p[0]));
        Arrays.sort(grade, Comparator.comparingInt(p -> p[1]));

        int tmpGrade = grade[0][0];
        int maxCount = 1;
        for (int i = 1; i < grade.length; i++) {
            if (tmpGrade > grade[i][0]) {
                maxCount++;
                tmpGrade = grade[i][0];
            }
        }

        return maxCount;
    }
}