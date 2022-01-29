package coding.test.baekjoon.그리디_알고리즘.행렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int count = 0;
    static int[][] aGraph;
    static int[][] bGraph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //y
        int M = Integer.parseInt(st.nextToken()); //x

        aGraph = new int[N][M];
        bGraph = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < M; j++) {
                aGraph[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < M; j++) {
                bGraph[i][j] = line.charAt(j) - '0';
            }
        }

        int result = 0;
        if (N >= 3 && M >= 3) {
            for (int i = 0; i < N - 2; i++) {
                for (int j = 0; j < M - 2; j++) {
                    if (aGraph[i][j] != bGraph[i][j]) {
                        change(j, i);
                        count++;
                    }
                }
            }
            result = count;
        }

        if (Arrays.deepEquals(aGraph, bGraph)) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }

    public static void change(int x, int y) {
        for (int i = y; i < y + 3; i++) {
            for (int j = x; j < x + 3; j++) {
                bGraph[i][j] = bGraph[i][j] == 0 ? 1 : 0;
            }
        }
    }
}