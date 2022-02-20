package inflearn_Greedy09;
import java.util.*;

public class UnF {
    static int[] unf;
    static int n, m;

    public static int Find(int v) {
        if(v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if(fa != fb) unf[fa] = fb;
    }
    public static void main(String[] args) {
        UnF T = new UnF();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        unf = new int[n+1];
        for (int i = 0; i <= n; i++) unf[i] = i;

        for (int i = 0; i < m; i++) {
            int a=kb.nextInt();
            int b=kb.nextInt();
            Union(a,b);
        }
        int f1=kb.nextInt();
        int f2=kb.nextInt();
        int fa = Find(f1);
        int fb = Find(f2);
        if(fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }
}