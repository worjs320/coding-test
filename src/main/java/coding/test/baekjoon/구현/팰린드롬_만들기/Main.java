package coding.test.baekjoon.구현.팰린드롬_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int index = 0;
        while (!isPalindrome(S.substring(index))) {
            index ++;
        }

        System.out.println(S.length() + index);
    }

    public static boolean isPalindrome(String S) {
        boolean result = true;
        for (int i = 0; i < S.length() / 2; i++) {
            char leftC = S.charAt(i);
            char rightC = S.charAt(S.length() - 1 - i);

            if (leftC != rightC) {
                result = false;
                break;
            }
        }
        return result;
    }
}
