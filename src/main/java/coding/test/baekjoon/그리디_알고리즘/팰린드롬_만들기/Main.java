package coding.test.baekjoon.그리디_알고리즘.팰린드롬_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int[] alphabet = new int[26];

        for (int i = 0; i < name.length(); i++) {
            alphabet[name.charAt(i) - 'A']++;
        }

        StringBuilder sb = new StringBuilder();
        int oddCount = 0;
        Character tmpChar = null;
        for (int i = 0; i < alphabet.length; i++) {
            int charCount = alphabet[i];
            if (charCount % 2 == 0) {
                for (int j = 0; j < charCount; j++) {
                    sb.insert(sb.length() / 2, (char) (i + 65));
                }
            } else {
                oddCount++;
                for (int j = 0; j < charCount - 1; j++) {
                    sb.insert(sb.length() / 2, (char) (i + 65));
                }
                tmpChar = (char) (i + 65);
            }
        }

        if (tmpChar != null) sb.insert(sb.length() / 2, tmpChar);

        if (oddCount > 1) {
            System.out.println("I'm Sorry Hansoo");
        } else {
            System.out.println(sb);
        }
    }
}