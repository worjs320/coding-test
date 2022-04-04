package coding.test.baekjoon.구현.나는야_포켓몬_마스터_이다솜;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] arr = new String[N + 1];

        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            hashMap.put(str, i);
            arr[i] =  str;
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            boolean isNumeric = str.chars().allMatch(Character::isDigit);

            if (isNumeric) {
                System.out.println(arr[Integer.parseInt(str)]);
            } else {
                System.out.println(hashMap.get(str));
            }
        }

    }
}

