package inflearn_Greedy09;

import java.util.*;

class Edge implements Comparable<Edge> {
    public int vex;
    public int cost;
    Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge obj) {
        return this.cost - obj.cost;
    }
}
public class D {
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;
    static int n, m;
    public void dijk(int v) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        dis[v] = 0; //시작점
        pQ.offer(new Edge(v, 0));

        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll(); //우선순위 큐 cost 제일 낮은 Edge부터 꺼내줌 ( compareTo 구현함)
            int now = tmp.vex;
            int nowCost = tmp.cost;
            if(dis[now] < nowCost) continue;// 여기서 탐색안해도 되는 것 cut (기존 distance 배열 안에 있는 최신화된 최솟값보다 크면 의미 없으니까)

            for (Edge ob : graph.get(now)) {
                if (dis[ob.vex] > ob.cost + nowCost) {
                    dis[ob.vex] = ob.cost + nowCost;
                    pQ.offer(new Edge(ob.vex, ob.cost+nowCost));
                }
            }

        }

    }
    public static void main(String[] args) {
        D T = new D();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();
        dis = new int[n+1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            int v1=kb.nextInt();
            int v2=kb.nextInt();
            int cost=kb.nextInt();
            graph.get(v1).add(new Edge(v2, cost));
        }
        T.dijk(1);

        for (int i = 2; i <= n; i++) {
            if(dis[i]!=Integer.MAX_VALUE) System.out.println(i+ " : " + dis[i]);
            else System.out.println(i+" : impossible");
        }
        System.out.println();
    }
}