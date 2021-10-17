package inflearn_Sort06;

import java.util.*;

public class Sort0604 {
    public static int[] solution(int size, int n, int[] arr){
        int[] cache = new int[size];
        int now = 0;
        for (int task : arr) {
            int idx = 0;

            for (int i = 0; i < size ; i++) {
                if (cache[i] == task) {
                    idx = i;
                }
            }

            //캐시 메모리에 있든 없든 하나씩 뒤로 싹 밀어주는건똑같음 이거 공통로직으로 분리하면 된다.
            System.out.println("idx = " + idx);
            if (idx == ) {
                for (int i = 0; i < ; i++) {

                }
            } else {
                int temp = cache[idx];
                for (int i = idx; i > 0; i--) {
                    cache[idx] = cache[idx-1];
                }
                cache[0] = temp;
            }
        }
        return cache;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int s=kb.nextInt();
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : solution(s, n, arr)) System.out.print(x+" ");
        kb.close();
    }
}
