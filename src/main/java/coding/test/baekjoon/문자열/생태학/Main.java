package coding.test.baekjoon.문자열.생태학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> treeMap = new HashMap<>();
        ArrayList<String> treeList = new ArrayList<>();
        int count = 0;

        String tree = br.readLine();
        do {
            treeMap.put(tree, treeMap.getOrDefault(tree, 0) + 1);
            treeList.add(tree);
            count++;
            tree = br.readLine();
        } while (tree != null && tree.length() != 0);

        Collections.sort(treeList);

        StringBuilder sb = new StringBuilder();
        String prevTree = "";
        for (int i = 0; i < treeList.size(); i++) {
            String oneTree = treeList.get(i);
            if (!oneTree.equals(prevTree)) {
                String percent = String.format("%.4f", (float) treeMap.get(oneTree) / count * 100);
                sb.append(oneTree).append(" ").append(percent).append("\n");
            }
            prevTree = oneTree;
        }

        System.out.println(sb);
    }
}
