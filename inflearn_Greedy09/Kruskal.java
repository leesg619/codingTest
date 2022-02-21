package inflearn_Greedy09;
import java.util.*;

class Edge implements Comparable<Edge> {
    public int x;
    public int y;
    public int cost;
    public Edge(int x, int y, int cost) {
        this.x = x;
        this.y = y;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge obj) {
        return cost - obj.cost; //cost 오름차순
    }

    @Override
    public String toString() {
        return "Edge{" +
                "x=" + x +
                ", y=" + y +
                ", cost=" + cost +
                '}';
    }
}
public class Kruskal {
    static int[] unf;
    static int n, m;
    static int totalCost, totalEdges;
    static ArrayList<Edge> edges;

    public int Find(int v) {
        if(v == unf[v]) return v;
        else return unf[v]=Find(unf[v]);
    }
    public void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if(fa != fb) unf[fa]=fb;
    }

    public void solution() {
        Collections.sort(edges);
        for (Edge edge : edges) {
            int fx = Find(edge.x);
            int fy = Find(edge.y);
            if(fx != fy){
                Union(edge.x, edge.y);
                totalCost += edge.cost;
                totalEdges++;
            }
            if(totalEdges == n-1) break;
        }
    }
    public static void main(String[] args) {
        Kruskal T = new Kruskal();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        unf = new int[n+1];
        edges = new ArrayList<>();

        for (int i = 0; i <= n; i++) unf[i] = i;

        for (int i = 0; i < m; i++) {
            int a=kb.nextInt();
            int b=kb.nextInt();
            int c=kb.nextInt();
            edges.add(new Edge(a,b,c));
        }
        T.solution();
        System.out.println(totalCost);
    }
}