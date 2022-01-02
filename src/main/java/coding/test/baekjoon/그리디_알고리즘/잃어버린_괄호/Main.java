package coding.test.baekjoon.그리디_알고리즘.잃어버린_괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String expression = br.readLine();
        ArrayList<String> minus = new ArrayList<>(Arrays.asList(expression.split("-")));

        for (int i = 0; i < minus.size(); i++) {
            String tmp = minus.get(i);
            if (tmp.contains("+")) {
                String[] plusNumList = tmp.split("\\+");
                int addResult = 0;
                for (String num : plusNumList) {
                    addResult += Integer.parseInt(num);
                }
                minus.set(i, Integer.toString(addResult));
            }
        }

        int result = Integer.parseInt(minus.get(0));
        for (int i = 1; i < minus.size(); i++) {
            result -= Integer.parseInt(minus.get(i));
        }

        System.out.println(result);
    }
}