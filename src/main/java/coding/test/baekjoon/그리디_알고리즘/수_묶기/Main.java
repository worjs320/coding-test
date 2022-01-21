package coding.test.baekjoon.그리디_알고리즘.수_묶기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> mList = new ArrayList<>();
        ArrayList<Integer> pList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n > 0) {
                pList.add(n);
            } else {
                mList.add(n);
            }
        }

        Collections.sort(mList);
        pList.sort(Collections.reverseOrder());

        int result = 0;

        for (int i = 0; i < mList.size(); i++) {
            if (i + 1 < mList.size()) {
                result += mList.get(i) * mList.get(i + 1);
                i++;
            } else {
                result += mList.get(i);
            }
        }

        for (int i = 0; i < pList.size(); i++) {
            if (i + 1 < pList.size() && pList.get(i) != 1 && pList.get(i + 1) != 1) {
                result += pList.get(i) * pList.get(i + 1);
                i++;
            } else {
                result += pList.get(i);
            }
        }

        System.out.println(result);
    }
}

