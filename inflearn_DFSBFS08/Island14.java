package inflearn_DFSBFS08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    public int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int n;
    static int[][] land;
    static int answer;
    static int[] dx={-1,0,1,0,-1,1,-1,1};
    static int[] dy={0,1,0,-1,-1,-1,1,1};
    static Queue<Point> Q = new LinkedList<>();

    public void bfs() {
        while (!Q.isEmpty()) {
            Point tmp = Q.poll();

            for (int i = 0; i < 8; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n && land[nx][ny] == 1) {
                    land[nx][ny] = 0;
                    Q.offer(new Point(nx, ny));
                }
            }
        }

    }

    public void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 1) {
                    answer++;
                    Q.offer(new Point(i, j));
                    land[i][j] = 0;
                    bfs();
                }
            }
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
        T.solution();
        System.out.println(answer);
    }
}