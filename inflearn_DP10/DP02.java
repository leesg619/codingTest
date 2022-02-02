package inflearn_DP10;
import java.util.*;
public class DP02 {
    // 계단과 다른 점 : n번째돌에 왔다고 해서 건넌게 아니다 라는것을 인지 , 고로 답은 dp[n+1]
    //(예를 들어 돌 1개 : 1->end / end , 돌2개: 1->2->end 2->end 1->end 3개)
    public int dp(int n) {
        int [] dy = new int[n+2];
        dy[1] = 1; dy[2] = 2;

        for (int i = 3; i <= n+1; i++) {
            if (dy[i-1] != 0 && dy[i-2] != 0) {
                dy[i] = dy[i-1] + dy[i-2];
            }
        }
        return dy[n+1];
    }

    public static void main(String[] args) {
        DP02 T = new DP02();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.println(T.dp(n));
    }
}