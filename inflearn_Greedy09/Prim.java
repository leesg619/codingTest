package inflearn_Greedy09;
import java.util.*;
class Edge implements Comparable<Edge> { // 목적지 vex
    public int vex;
    public int cost;
    public Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge obj) {
        return cost - obj.cost; //cost 오름차순
    }
}
public class Prim {
    static int n, m;
    static int totalCost, totalEdges;
    static int[] ch;
    static ArrayList<ArrayList<Edge>> graph;
    public void solution() {
        PriorityQueue<Edge> pq = new PriorityQueue<>();

        pq.offer(new Edge(1, 0)); //0의 비용으로 1번정점. 여기가 중요함.

        while (!pq.isEmpty()) {
            Edge e = pq.poll();
            if(ch[e.vex] == 1) continue; //회로 방지

            totalCost+=e.cost;
            totalEdges++;
            ch[e.vex]=1;
            for (Edge edge : graph.get(e.vex)) {
                if (ch[edge.vex] == 1 ) continue; //회로 방지
                pq.offer(edge);
            }
        }

    }
    public static void main(String[] args) {
        Prim T = new Prim();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        ch = new int[n+1];
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        for (int i = 0; i < m; i++) {
            int a=kb.nextInt();
            int b=kb.nextInt();
            int c=kb.nextInt();
            graph.get(a).add(new Edge(b,c));
            graph.get(b).add(new Edge(a,c)); //무방향 인접그래프는 다음 한줄을 추가한다.
        }
        T.solution();
        System.out.println(totalCost);
    }
}
