package inflearn_DFSBFS08;
import java.util.Scanner;
public class memoization08 {
/*
*  nCr =  n 개중에 순서없이 r 개 뽑는 경우의 수 . 이를 공식없이 재귀로.
* */
    static int[][] memo;
    static int[][] ch;
    public int comb(int n, int r) { // 방문했던거면 memo를 리턴하고, 방문안했던거면 방문표시하고,
        if (n == 0 || r == 0) return 0; //벗어나면 리턴
        if (ch[n][r] != 0) return memo[n][r];

        ch[n][r] = 1; //방문 표시 먼저
        if (r == 1) {
            memo[n][r] = n;
            return memo[n][r];
        }
        if (n < r) {
            memo[n][r] = 0;
            return memo[n][r];
        }
        memo[n][r] = comb(n-1, r-1)+comb(n-1,r);
        return memo[n][r];
        /*답: 메모이제이션은 굳이 체크배열 쓸필요없이 if (memo[n][r] > 0) return memo[n][r] 로 하면됨.*/
        /*
        if(dy[n][r]>0) return dy[n][r];
		if(n==r || r==0) return 1; //  n C 0 = 1 이라네요 공식적으로...?
		else return dy[n][r]=DFS(n-1, r-1)+DFS(n-1, r);
		*/
    }

    public static void main(String[] args) {
        memoization08 T = new memoization08();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int r=kb.nextInt();
        memo = new int[n+1][r+1];
        ch = new int[n+1][r+1];
        System.out.println(T.comb(n, r));
    }
}
