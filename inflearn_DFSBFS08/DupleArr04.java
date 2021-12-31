package inflearn_DFSBFS08;

import java.util.Scanner;

public class DupleArr04 {
    static int n, m;
    static int[] pm;
    public void dfs(int L) {
        if (L == m) {
            for (int x: pm) {
                System.out.print(x+" ");
            }
            System.out.println();

        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                dfs(L+1);
            }
        }
    }
        public static void main(String[] args) {
        DupleArr04 T = new DupleArr04();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        pm = new int[m];
        T.dfs(0);

    }
}
