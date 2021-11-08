package inflearn_Search07;
import java.util.Scanner;

public class RouteNav {
    static int n;
    static int m;
    static int[][] graph;
    static int[] ch;
    static int answer;

    public void dfs(int v) {
        if (v == 5) {
            answer++;
//            for (int i = 2; i <= n; i++) {
//                ch[i]=0;  얘대신 ch[i]=1; dfs(i); 다음에  ch[i]=0;으로 해주면 됨.백트래킹하면서 바로 안간 처리 해주는거라
//            }
        } else {
            for (int i = 1; i <= n ; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    dfs(i);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args){
        RouteNav T = new RouteNav();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph=new int[n+1][n+1];
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph[a][b]=1;
        }
        ch[1]=1;
        T.dfs(1);
        System.out.println(answer);
    }
}
