package inflearn_DFSBFS08;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    public int x, y;
    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
}
public class Maze11 {
    static int[][] board, dis;
    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};
    static int answer = 0;

    public void BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();
        Q.add(new Point(x,y));
        board[x][y] = 1; //체크
        while (!Q.isEmpty()) {
            Point tmp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny]=1;
                    Q.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Maze11 T = new Maze11();
        Scanner kb = new Scanner(System.in);
        board=new int[8][8];
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                board[i][j]=kb.nextInt();
            }
        }
        dis = new int[8][8];
        T.BFS(1, 1);
        if (dis[7][7] == 0 ) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }


}
