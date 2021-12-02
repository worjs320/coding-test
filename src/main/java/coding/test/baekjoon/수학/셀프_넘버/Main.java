package coding.test.baekjoon.수학.셀프_넘버;


public class Main {
    public static void main(String[] args) {
        boolean[] selfNumberList = new boolean[10001];

        int number = 1;

        while (number < 10000) {
            int tmpNumber = number;
            int sum = tmpNumber;

            while (tmpNumber != 0) {
                sum += tmpNumber % 10;
                tmpNumber = tmpNumber / 10;
            }

            number++;

            if (sum > 10000) continue;

            selfNumberList[sum] = true;
        }

        for (int i = 1; i < selfNumberList.length; i++) {
            if (!selfNumberList[i]) System.out.println(i);
        }

    }
}

