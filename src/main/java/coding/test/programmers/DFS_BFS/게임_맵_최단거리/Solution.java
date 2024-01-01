package coding.test.programmers.DFS_BFS.게임_맵_최단거리;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int answer = -1;
    public int dX[] = {-1, 1, 0, 0};
    public int dY[] = {0, 0, -1, 1};
    public boolean visited[][];

    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        visited = new boolean[n][m];

        bfs(0, 0, maps);

        return answer;
    }

    public void bfs(int x, int y, int[][] maps) {
        visited[x][y] = true;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y, 0));

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.x == visited.length - 1 && current.y == visited[0].length - 1) {
                answer = current.count + 1;
            }

            for (int i = 0; i < 4; i++) {
                int mX = current.x + dX[i];
                int mY = current.y + dY[i];

                if (mX >= 0 && mX < visited.length && mY >= 0 && mY < visited[0].length && !visited[mX][mY] && maps[mX][mY] != 0) {
                    visited[mX][mY] = true;
                    queue.add(new Node(mX, mY, current.count + 1));
                }
            }
        }
    }

    public class Node {
        int x;
        int y;
        int count;

        Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}
