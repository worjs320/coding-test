package coding.test.baekjoon.그리디_알고리즘.뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char[] sChar = S.toCharArray();

        int zeroCount = 0;
        int oneCount = 0;
        char prevChar = sChar[0];
        int index = 1;

        if (sChar[0] == '0') {
            zeroCount++;
        } else {
            oneCount++;
        }
        while (index != sChar.length) {
            if (prevChar != sChar[index]) {
                prevChar = sChar[index];
                if (prevChar == '0') {
                    zeroCount++;
                } else {
                    oneCount++;
                }
            }
            index++;
        }

        System.out.println(Math.min(zeroCount, oneCount));
    }
}