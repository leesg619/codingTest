package inflearn_Search07;
import java.util.*;

public class GraphShortest {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;

    public int bfs(int v) {
        Queue<Integer> Q = new LinkedList<>();
        int[] ch = new int[n+1];
        ch[1] = 1;
        int level = 0;
        Q.offer(1);

        while (!Q.isEmpty()) {
            int len = Q.size();

            for (int i = 0; i < len; i++) {
                int tmp = Q.poll();

                if (tmp == v) return level;

                for (int nv : graph.get(tmp)) {
                    if (ch[nv] == 0) {
                        Q.offer(nv);
                        ch[nv] = 1;
                    }
                }
            }
            level++;
        }
        return level;
    }
    public static void main(String[] args) {
        GraphShortest T = new GraphShortest();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
//        System.out.println(2+" : "+ T.bfs(2));
        for (int i = 2; i <= n ; i++) {
            System.out.println(i+" : "+ T.bfs(i));
        }
        sc.close();
    }
}
