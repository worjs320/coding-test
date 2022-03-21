package coding.test.baekjoon.문자열.문자열_폭발;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String boom = br.readLine();

//        while (str.contains(boom)) {
//            str = str.replaceAll(boom, "");
//        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));

            if (sb.length() >= boom.length()) {
                String compareStr = sb.substring(sb.length() - boom.length(), sb.length());
                if (boom.equals(compareStr)) {
                    sb.delete(sb.length() - boom.length(), sb.length());
                }
            }
        }

        if (sb.toString().equals("")) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb);
        }
    }
}
