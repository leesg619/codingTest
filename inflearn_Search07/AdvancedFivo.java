package inflearn_Search07;

import java.util.Scanner;

public class AdvancedFivo {
    static int[] memoization; // 피보나치를 "재귀"로 구현하면 계산적으로 낭비가 많음 ( 같은거 가지치기하면서 계속 연산 ) 따라서 메모이제이션 활용
    public static int fivo(int n) {
        if (memoization[n] > 0) return memoization[n]; //이미 한번 계산해서 넣어놓은게 있다면 가지치기 안하고 바로 리턴해주기
        if (n == 1) {
            return memoization[n]=1;
        } else if (n == 2) {
            return memoization[n]=1;
        } else {
            return memoization[n] = fivo(n - 2) + fivo(n - 1);  //배열에넣으면서 값리턴
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        memoization = new int[n+1];
        fivo(n);
        for (int i = 1; i < n+1; i++) System.out.print(memoization[i]+" ");
        kb.close();
    }
}
