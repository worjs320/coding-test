package coding.test.baekjoon.자료_구조.해시.베스트셀러;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> books = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String bookTitle = br.readLine();
            books.put(bookTitle, books.getOrDefault(bookTitle, 0) + 1);
        }

        int tmpCount = 0;
        String result = "";
        for (Map.Entry<String, Integer> book: books.entrySet()) {
            String key = book.getKey();
            int value = book.getValue();

            if (value > tmpCount) {
                result = key;
                tmpCount = value;
            } else if (value == tmpCount) {
                if (key.compareTo(result) < 0) {
                    result = key;
                }
            }
        }

        System.out.println(result);
    }
}
