package inflearn_Search07;

import java.util.ArrayList;
import java.util.Scanner;

//ArrayList 속의 ArrayList (인접리스트) 방식으로 연습할것 !!!
public class RouteNav2 {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void dfs(int v) {
        if (v == 5) {
            answer++;
        } else {
            for (int nv: graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    dfs(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        RouteNav2 T = new RouteNav2();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.dfs(1);
        System.out.println(answer);
    }
}
