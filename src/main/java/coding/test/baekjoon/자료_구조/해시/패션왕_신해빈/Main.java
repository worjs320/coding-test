package coding.test.baekjoon.자료_구조.해시.패션왕_신해빈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int result = 1;
            HashMap<String, Integer> hashMap = new HashMap<>();
            int tmpN = Integer.parseInt(br.readLine());

            for (int j = 0; j < tmpN; j++) {
                st = new StringTokenizer(br.readLine());
                String a = st.nextToken();
                String b = st.nextToken();
                hashMap.put(b, hashMap.getOrDefault(b, 0) + 1);
            }

            for (String key : hashMap.keySet()) {
                result *= hashMap.get(key) + 1;
            }

            System.out.println(result - 1);
        }

    }
}
