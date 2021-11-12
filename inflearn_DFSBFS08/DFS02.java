package inflearn_DFSBFS08;
import java.util.Scanner;

public class DFS02 {
    static int c, n;
    static int[] weight;
    static int answer;

    public void dfs(int L, int sum) {
        if (sum > c) return;
        if (L == n) {  // n-1 아니고 n임을 주의..
            answer = Math.max(answer, sum);
            return;
        } else {
            dfs(L + 1, sum);
            dfs(L + 1, sum + weight[L]);
        }
    }
    public static void main(String[] args) {
        DFS02 T = new DFS02();
        Scanner kb = new Scanner(System.in);
        c=kb.nextInt();
        n=kb.nextInt();
        weight = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = kb.nextInt();
        }
        T.dfs(0, 0);
        System.out.println(answer);
    }
}
