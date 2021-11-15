import java.util.Scanner;

public class DFS03 {
    static int n, m;
    static int[] score, time;
    static int answer;

    public void dfs(int L, int sum, int totalTime) {
        if (totalTime > m) return;
        if (L == n) {
            answer = Math.max(answer, sum);
            return;
        } else {
            dfs(L+1, sum+score[L], totalTime+time[L]);
            dfs(L+1, sum, totalTime);
        }

    }

    public static void main(String[] args) {
        DFS03 T = new DFS03();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        score = new int[n];
        time = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = kb.nextInt();
            time[i] = kb.nextInt();
        }
        T.dfs(0, 0, 0);
        System.out.println(answer);
    }
}
