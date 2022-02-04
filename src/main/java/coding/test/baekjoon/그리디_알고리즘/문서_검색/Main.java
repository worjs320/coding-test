package coding.test.baekjoon.그리디_알고리즘.문서_검색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String doc = br.readLine();   // 문서
        String word = br.readLine();  // 찾을 단어

        int count = 0;

        for (int i = 0; i < doc.length(); i++) {
            if (doc.startsWith(word, i)) {
                count++;
                i += word.length() - 1;
            }
        }

//        while (true) {
//            if (doc.contains(word)) {
//                count++;
//                doc = doc.replaceFirst(word, "");
//            } else {
//                break;
//            }
//        }

        System.out.println(count);
    }
}