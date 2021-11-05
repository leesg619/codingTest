package inflearn_Search07;
import java.util.*;

public class BFS2 {
    Queue<Integer> Q = new LinkedList<>();
    // 좌표가 1부터 10000이랬으니 중복(time limit 발생함) 및 시간복잡도를 줄이기 위해체크 배열 추가한다.
    int[] ch = new int[10001];  // offer 하기 전에 미리 인덱스 체크체크~
    public int BFS(int n, int k) {

        Q.offer(n);
        ch[n]=1;
        int level = 0;

        while (!Q.isEmpty()) {
            int len = Q.size();

            for (int i = 0; i < len; i++) {
                int tmp = Q.poll();
                if (tmp == k) return level;

                if (tmp-1 <= 10000 && tmp-1 >=0 && ch[tmp-1]==0 ) { Q.offer(tmp - 1); ch[tmp-1]=1;}
                if (tmp+1 <= 10000 && tmp+1 >=0 && ch[tmp+1]==0 ) {Q.offer(tmp + 1); ch[tmp+1]=1;}
                if (tmp+5 <= 10000 && tmp+5 >=0 && ch[tmp+5]==0 ) {Q.offer(tmp + 5); ch[tmp+5]=1;}
                // -1  , 1 , 5 배열에 넣어주면 더 깔끔하게 처리 가능     int[] dis = {1, -1, 5};
            }

            level++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        BFS2 main = new BFS2();
        System.out.print(main.BFS(n, k));
        kb.close();
    }
}
