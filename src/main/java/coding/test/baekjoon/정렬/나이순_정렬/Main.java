package coding.test.baekjoon.정렬.나이순_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Person[] personList = new Person[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            personList[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Arrays.sort(personList, Comparator.comparingInt(p -> p.score));

        for (Person person : personList) {
            System.out.println(person.toString());
        }
    }
}

class Person {
    int score;
    String personId;

    Person(int score, String personId) {
        this.score = score;
        this.personId = personId;
    }

    @Override
    public String toString() {
        return score + " " + personId;
    }
}
