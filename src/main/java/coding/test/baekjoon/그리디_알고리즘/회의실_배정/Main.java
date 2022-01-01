package coding.test.baekjoon.그리디_알고리즘.회의실_배정;

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
        int N = Integer.parseInt(st.nextToken());

        int[][] schedule = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            schedule[i][0] = Integer.parseInt(st.nextToken());
            schedule[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(schedule, (Comparator.comparingInt(o -> o[0])));
        Arrays.sort(schedule, (Comparator.comparingInt(o -> o[1])));

        int count = 1;
        int[] tmpSchedule = schedule[0];
        for (int i = 1; i < N; i++) {
            if (tmpSchedule[1] <= schedule[i][0]) {
                count++;
                tmpSchedule = schedule[i];
            }
        }

        System.out.println(count);
    }
}