package coding.test.baekjoon.정렬.국영수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            students.add(new Student(name, korean, eng, math));
        }

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s2.korean == s1.korean && s2.eng == s1.eng && s2.math == s1.math) {
                    return s1.name.compareTo(s2.name);
                }
                if (s2.korean == s1.korean && s2.eng == s1.eng) {
                    return s2.math - s1.math;
                }
                if (s2.korean == s1.korean) {
                    return s1.eng - s2.eng;
                }

                return s2.korean - s1.korean;
            }
        };

        Collections.sort(students, comparator);

        for (Student student: students) {
            System.out.println(student.name);
        }
    }
}

class Student {
    String name;
    int korean;
    int eng;
    int math;

    Student(String name, int korean, int eng, int math) {
        this.name = name;
        this.korean = korean;
        this.eng = eng;
        this.math = math;
    }
}
