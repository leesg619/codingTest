package inflearn_Search07;

public class DFS2 {
    static int n;
    static int[] ch;

    public void DFS(int L) {
        if (L == n + 1) {
            String tmp ="";
            for (int i = 1; i < n+1; i++) {
                if (ch[i]==1) tmp += (i+" ");
            }

            if (tmp.length()>0) System.out.println(tmp);
        } else {
            ch[L] = 1;
            DFS(L+1); // 사용 한다고 가정

            ch[L] = 0;
            DFS(L+1); //사용 안한다고 가정
        }
    }

    public static void main(String[] args) {
        DFS2 T = new DFS2();
        n = 3;
        ch = new int[n+1];
        T.DFS(1);
    }
}
