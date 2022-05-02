package coding.test.baekjoon.구현.치킨_배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N, M, answer;
    static ArrayList<Home> homes;
    static ArrayList<Chicken> chickens;
    static boolean[] now;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        homes = new ArrayList<>();
        chickens = new ArrayList<>();
        answer = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int value = Integer.parseInt(st.nextToken());

                if (value == 1) {
                    homes.add(new Home(j, i));
                } else if (value == 2) {
                    chickens.add(new Chicken(j, i));
                }
            }
        }

        now = new boolean[chickens.size()];

        DFS(0, 0);

        System.out.println(answer);
    }

    static public void DFS(int index, int count) {
        if (count == M) {
            int sum = 0;

            for (Home home : homes) {
                int min = Integer.MAX_VALUE;

                for (int i = 0; i < chickens.size(); i++) {
                    Chicken chicken = chickens.get(i);
                    if (now[i]) {
                        min = Math.min(min, Math.abs(home.x - chicken.x) + Math.abs(home.y - chicken.y));
                    }
                }
                sum += min;
            }

//            System.out.printf("answer: %d, sum: %d \n", answer, sum);
            answer = Math.min(answer, sum);
            return;
        }

        for (int i = index; i < chickens.size(); i++) {
            now[i] = true;
            DFS(i + 1, count + 1);
            now[i] = false;
        }
    }
}

class Home {
    int x;
    int y;

    Home(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Chicken {
    int x;
    int y;

    Chicken(int x, int y) {
        this.x = x;
        this.y = y;
    }
}