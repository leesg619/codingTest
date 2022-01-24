package inflearn_DFSBFS08;


import java.util.Scanner;

public class Maze10 {
    static int[][] board;
    static int[][] ch;
    static int answer = 0;
    public void DFS(int x, int y) {
        if (x>7 || y>7) return;
        if (x<1 || y<1) return;
        if (board[x][y] == 1) return;
        if (ch[x][y] == 1) return;
        if (x == 7 && y == 7) {
            answer += 1;
            return;
        } else {
            ch[x][y]=1;
            DFS(x+1,y);
            DFS(x-1,y);
            DFS(x,y+1);
            DFS(x,y-1);
            ch[x][y]=0;
        }
    }
    public static void main(String[] args) {
        Maze10 T = new Maze10();
        Scanner kb = new Scanner(System.in);
        board=new int[8][8];
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                board[i][j]=kb.nextInt();
            }
        }
        ch = new int[8][8];
        T.DFS(1, 1);
        System.out.println(answer);
    }


}
