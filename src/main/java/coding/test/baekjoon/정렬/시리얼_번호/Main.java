package coding.test.baekjoon.정렬.시리얼_번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<String> serials = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            serials.add(br.readLine());
        }

        serials.sort((o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            } else {
                int o1Val = 0;
                int o2Val = 0;
                for (int i = 0; i < o1.length(); i++) {
                    if (Character.isDigit(o1.charAt(i))) o1Val += o1.charAt(i) - '0';
                    if (Character.isDigit(o2.charAt(i))) o2Val += o2.charAt(i) - '0';
                }

                if (o1Val != o2Val) {
                    return o1Val - o2Val;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });

        for (String s : serials) {
            System.out.println(s);
        }
    }
}
