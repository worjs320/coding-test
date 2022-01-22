package coding.test.baekjoon.그리디_알고리즘.보석_도둑;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //보석 개수
        int K = Integer.parseInt(st.nextToken()); //가방 개수

        Jewel[] jewels = new Jewel[N];
        int[] bags = new int[K];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()); //무게
            int V = Integer.parseInt(st.nextToken()); //가격
            jewels[i] = new Jewel(M, V);
        }

        for (int i = 0; i < K; i++) {
            int C = Integer.parseInt(br.readLine()); //가방에 담을 수 있는 최대 무게
            bags[i] = C;
        }

        Arrays.sort(bags);

        Arrays.sort(jewels, (o1, o2) -> o1.weight - o2.weight);

        PriorityQueue<Jewel> queue = new PriorityQueue<>((o1, o2) -> o2.price - o1.price);

        int jewelIndex = 0;
        long result = 0;
        for (int i = 0; i < bags.length; i++) {
            while (jewelIndex < N && jewels[jewelIndex].weight <= bags[i]) {
                queue.add(jewels[jewelIndex++]);
            }

            if (!queue.isEmpty()) {
                result += queue.poll().price;
            }
        }

        System.out.print(result);
    }

    static class Jewel {
        int weight;
        int price;

        public Jewel(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }
    }
}

