import java.util.*;

class Point {
    public int x, y;
    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
}

public class Tomato12 {
    static int[][] box, dis;
    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};
    static int m, n;
    public void BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();

        for(int i=1; i<=n; i++){  //익은애부터 Q offer
            for(int j=1; j<=m; j++){
                if (box[i][j] == 1){
                    Q.offer(new Point(i,j));
                    dis[i][j] = 1;
                }

            }
        }

        while (!Q.isEmpty()) {
            Point tmp = Q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if (nx >= 1 && nx <= n && ny >= 1 && ny <= m ) {
                    if (box[nx][ny] == -1) {
                        dis[nx][ny] = -1;
                        continue;
                    }
                    if (box[nx][ny] == 1) {
                        dis[nx][ny] = Math.min(dis[nx][ny], dis[tmp.x][tmp.y]+1);
                        continue;
                    }

                    if (box[nx][ny] == 0) {
                        dis[nx][ny] = dis[tmp.x][tmp.y]+1;
                        box[nx][ny] = 1;
                        Q.offer(new Point(nx,ny));
                        continue;
                    }
                }

            }
        }
    }
    public static void main(String[] args) {
        Tomato12 T = new Tomato12();
        Scanner kb = new Scanner(System.in);
        m = kb.nextInt();
        n = kb.nextInt();

        box = new int[n+1][m+1];
        dis = new int[n+1][m+1];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                box[i][j]=kb.nextInt();
            }
        }

        T.BFS(1, 1);
        int answer = -1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if (dis[i][j] == 0) {
                    System.out.println(-1);
                    return;
                } else if (dis[i][j] >= 1) answer = Math.max(answer, dis[i][j]);
                else continue;
            }
        }

        System.out.println(answer-1);  // 처음부터 익어있는 토마토 : 1일 로 쳐서 마지막에 -1 해줌
        /*
         각각 다 익는데 최소값을 저장해둔 다음, 배열에서 제일 큰 수가 정답이다.
         이렇게해도 되고, box안에있는 안익은 토마토를 익은 토마토로 바꾸면서
        0에서 1로 바꾸기 때문에 bfs후 box먼저체크해서 안익은애 발견시켜 도출해낼수있음.
        그리고 scanner로 입력하는 과정에서 Q에 넣으면 코드가 더 깔-금*/

    }
}
