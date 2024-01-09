package coding.test.programmers.기타.공원산책;

import java.util.Arrays;

public class Solution {
    int[][] parkMap;
    int[] now;

    public int[] solution(String[] park, String[] routes) {
        parkMap = new int[park.length][park[0].length()];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                char point = park[i].charAt(j);

                if (point == 'S') {
                    now = new int[]{i, j};
                } else if (point == 'O') {
                    parkMap[i][j] = 0;
                } else if (point == 'X') {
                    parkMap[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String op = routes[i].split(" ")[0];
            int n = Integer.parseInt(routes[i].split(" ")[1]);
            processMove(op, n);
        }

        return now;
    }

    public void processMove(String op, int n) {
        int movePoint = 0;
        switch (op) {
            case "N":
                movePoint = now[0] - n;
                if (movePoint < 0) return;
                for (int i = now[0]; i >= movePoint; i--) {
                    if (parkMap[i][now[1]] == -1) return;
                }
                now[0] = movePoint;
                break;
            case "S":
                movePoint = now[0] + n;
                if (movePoint >= parkMap.length) return;
                for (int i = now[0]; i <= movePoint; i++) {
                    if (parkMap[i][now[1]] == -1) return;
                }
                now[0] = movePoint;
                break;
            case "W":
                movePoint = now[1] - n;
                if (movePoint < 0) return;
                for (int i = now[1]; i >= movePoint; i--) {
                    if (parkMap[now[0]][i] == -1) return;
                }
                now[1] = movePoint;
                break;
            case "E":
                movePoint = now[1] + n;
                if (movePoint >= parkMap[0].length) return;
                for (int i = now[1]; i <= movePoint; i++) {
                    if (parkMap[now[0]][i] == -1) return;
                }
                now[1] = movePoint;
                break;
        }
    }
}