package inflearn_Search07;
import java.util.*;

public class GraphShortest2 {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;
    //dis 배열 : 1에서부터 각 vertex까지의 최소 거리(간선)를 저장하는 변수
    public void bfs(int v) {
        Queue<Integer> Q = new LinkedList<>();
        ch[1] = 1;
        dis[1] = 0;
        Q.offer(v);
        while (!Q.isEmpty()) {
            int tmp = Q.poll();
            for (int nv: graph.get(tmp)) {
                if (ch[nv] == 0) {
                    dis[nv] = dis[tmp] + 1;
                    ch[nv] = 1;
                    Q.offer(nv);
                }
            }
        }

    }
    public static void main(String[] args) {
        GraphShortest2 T = new GraphShortest2();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        dis = new int[n+1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
//        System.out.println(2+" : "+ T.bfs(2));
        T.bfs(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i+" : "+ dis[i]);
        }
        sc.close();
    }
}
