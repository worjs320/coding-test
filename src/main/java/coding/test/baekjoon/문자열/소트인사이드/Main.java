package coding.test.baekjoon.문자열.소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        ArrayList<Integer> nList = new ArrayList<>();

        for (int i = 0; i < N.length(); i++) {
            nList.add(N.charAt(i) - '0');
        }

        nList.sort(Comparator.reverseOrder());

        for (int i = 0; i < nList.size(); i++) {
            System.out.print(nList.get(i));
        }
    }
}
