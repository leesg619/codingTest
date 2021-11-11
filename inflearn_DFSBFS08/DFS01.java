package inflearn_DFSBFS08;

import java.util.Scanner;

public class DFS01 {
    static int total;
    static int n;
    static String answer = "NO";
    boolean flag = false;
    public void dfs(int level, int sum, int[] arr) { //0번째 인자부터 끝까지 하나씩 올라가면서(level 개념으로) 해당원소 넣는경우 아닌경우로 가지뻗기
        if (flag) return; // 한번 찾으면 그이후로 스택의 남은애들 다 빠르게 연산종료시키려고.
        if (sum * 2 > total) return; //절반이상이 되면 조건 안맞아서 끝

        if (level == n) {
            if (sum * 2 == total) { // 두 부분집합의 합이 같은경우 = 모든원소 총합 /2
                answer = "YES";
                flag = true;
            }
        }
        else {
            dfs(level+1, sum, arr);
            dfs(level+1, sum+arr[level], arr);
        }
    }
    public static void main(String[] args) {
        DFS01 T = new DFS01();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
            total+=arr[i];
        }
        T.dfs(0, 0, arr);
        System.out.println(answer);
    }
}
