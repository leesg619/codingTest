package inflearn_DFSBFS08;

import java.util.Scanner;

public class Comb {
    static int n, m;
    static int[] combi;

    public void DFS(int L, int tmp){
        if (L == m) {
            for (int i = 0; i <m ; i++) {
                System.out.print(combi[i]+ " ");
            }
            System.out.println();
        } else {
                for (int i= tmp; i <= n; i++) {
                    combi[L] = i;
                    DFS(L+1, i+1);
                }
            }

        }

    public static void main(String[] args){
        Comb T = new Comb();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        combi=new int[n+1];
        T.DFS(0, 1);
    }
}


//import java.util.*;
//public class Main
//{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = 0; i < 9; i++) {
//            int tmp = sc.nextInt();
//            N-=tmp;
//        }
//        System.out.println(N);
//
//    }
//}
