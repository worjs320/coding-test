package coding.test.baekjoon.구현.그룹_단어_체커;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = N;

        ArrayList<Character> tmp = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String tmpWord = br.readLine();
            tmp.clear();

            for (int j = 0; j < tmpWord.length(); j++) {
                char character = tmpWord.charAt(j);
                if (!tmp.isEmpty() && tmp.get(tmp.size() - 1) != character && tmp.contains(character)) {
                    count--;
                    tmp.clear();
                    break;
                }
                tmp.add(character);
            }
        }

        System.out.println(count);
    }
}

