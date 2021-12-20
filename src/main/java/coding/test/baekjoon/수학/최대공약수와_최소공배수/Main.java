package coding.test.baekjoon.수학.최대공약수와_최소공배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int max;
        int min;

        if (a > b) {
            max = a;
            min = b;
        } else if (a < b) {
            max = b;
            min = a;
        } else {
            max = min = a;
        }

        for (int i = min; i > 0; i--) {
            if (max % i == 0 && min % i == 0) {
                System.out.println(i);
                break;
            }
        }

        int i = 1;
        while (true) {
            if ((max * i) % min == 0) {
                System.out.println(max * i);
                break;
            }
            i++;
        }
    }
}



