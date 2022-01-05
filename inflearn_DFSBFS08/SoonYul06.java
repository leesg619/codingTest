package inflearn_DFSBFS08;

import java.util.Scanner;

public class SoonYul06 {
    static int n, m;
    static int[] arr, pm, ch;

    public void printArr(int[] arr) {
        for (int n : arr) {
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public void dfs(int L) {
        if (L == m) {
            printArr(pm);

            return;
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] != 1) {
                    pm[L] = arr[i];
                    ch[i] = 1;
                    dfs(L+1);
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        SoonYul06 T = new SoonYul06();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        pm = new int[m];
        ch = new int[n];
        T.dfs(0);
    }
}
