package inflearn_DFSBFS08;

import java.util.Arrays;
import java.util.Scanner;

public class CoinExchange {
    static int n, m, answer=Integer.MAX_VALUE;
    static int[] arr;
    public void dfs(int L, int sum) {
        if (sum > m) return;
        if (L >= answer) return; // 시간복잡도 줄이기 1
        if (sum == m) {
            answer = L;
            return;
        }
        for (int i = n-1; i >= 0 ; i--) { // 시간 복잡도 줄이기 2 큰거부터.
            dfs(L+1, sum+arr[i]);
        }
    }

    public static void main(String[] args) {
        CoinExchange T = new CoinExchange();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        Arrays.sort(arr); // 역순 : Arrays.sort(arr, Collections.reverseOrder()); 대신 이거는 Integer형으로 선언하고 해야함.
        m=kb.nextInt();
        T.dfs(0, 0);
        System.out.println(answer);
    }
}
