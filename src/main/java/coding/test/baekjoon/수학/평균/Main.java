package coding.test.baekjoon.수학.평균;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        float result = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        float M = 0;
        ArrayList<Float> scoreList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            float score = Float.parseFloat(st.nextToken());
            if (score > M) M = score;
            scoreList.add(score);
        }

        for (float score : scoreList) {
            result += score / M * 100;
        }

        result = result / N;

        System.out.println(result);
    }

}



