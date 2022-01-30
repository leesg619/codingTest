package inflearn_DFSBFS08;

import java.util.Scanner;

public class Main {
    static int n, m;
    static int[][] land;
    static int answer;
    static int[] dx={-1,0,1,0,-1,1,-1,1};
    static int[] dy={0,1,0,-1,-1,-1,1,1};
    static boolean flag = false;

    public void dfs(int x, int y) {
        if ( x<0 || y<0 || x>=n || y>=n || land[x][y] == 0) return;

        if (land[x][y] == 1) {
            land[x][y] = 0; //check
            for (int i = 0; i < 8; i++) {
                dfs(x+dx[i], y+ dy[i]);
            }
            flag = true;
        }

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        land = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                land[i][j] = kb.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                T.dfs(i, j);
                if (flag){
                    answer++;
                    flag = false;
                }

            }
        }

    }
}