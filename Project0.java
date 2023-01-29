package prj0;

import java.util.*;

/**
 * 
 * @author Krishna Nair
 *
 */
public class Project0 {
    public static void main(String[] args) {
        // Add your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int currNum;
        int nextNum;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(
            N);
        for (int j = 0; j < N; j++) {
            list.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < M; i++) {
            currNum = sc.nextInt();
            nextNum = sc.nextInt();
            list.get(currNum - 1).add(nextNum);
            list.get(nextNum - 1).add(currNum);
        }
        for (int k = 0; k < Q; k++) {
            StringBuilder sb = new StringBuilder();
            currNum = sc.nextInt();
            for (int l = 0; l < list.get(currNum - 1).size(); l++) {
                sb.append(list.get(currNum - 1).get(l));
                sb.append(" ");
            }
            if (list.get(currNum - 1).size() == 0) {
                System.out.println("-1");
            }
            else {
                System.out.println(sb.toString());
            }
        }
        sc.close();
    }
}
