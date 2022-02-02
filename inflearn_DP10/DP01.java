package inflearn_DP10;
import java.util.*;
public class DP01 {
    public int dp(int n) {
        int [] dy = new int[n+1];
        dy[0] = 1; dy[1] = 1;  // 0계단 가는법 0 1개, 1계단가는법 1 1개

        for (int i = 2; i <= n; i++) {
            if (dy[i-1] != 0 && dy[i-2] != 0) { //이문제에선 없어도됨
                dy[i] = dy[i-1] + dy[i-2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        DP01 T = new DP01();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.println(T.dp(n));
    }
}