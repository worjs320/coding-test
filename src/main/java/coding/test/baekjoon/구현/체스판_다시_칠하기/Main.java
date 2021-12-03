package coding.test.baekjoon.구현.체스판_다시_칠하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static String[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 세로
        int M = Integer.parseInt(st.nextToken()); // 가로

        arr = new String[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String token = st.nextToken();
            for (int j = 0; j < M; j++) {
                arr[i][j] = String.valueOf(token.charAt(j));
            }
        }

        int xStart = M - 7;
        int YStart = N - 7;

        for (int i = 0; i < YStart; i++) {
            for (int j = 0; j < xStart; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }


    public static void find(int y, int x) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        String tmp = arr[y][x];

        for (int i = y; i < end_y; i++) {
            for (int j = x; j < end_x; j++) {

                if (arr[i][j].equals(tmp)) {
                    count++;
                }

                tmp = tmp.equals("W") ? "B" : "W";
            }

            tmp = tmp.equals("W") ? "B" : "W";
        }

        count = Math.min(count, 64 - count);

        min = Math.min(min, count);
    }
}
