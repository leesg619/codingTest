package inflearn_Sort06;
import java.util.*;

public class Sort0604 {
    public static int[] solution(int size, int n, int[] arr){
        int[] cache = new int[size];
        for (int task : arr) {
            int idx = -1;  //기존 캐쉬 안에 해당 task가 있는지 확인. 없으면 넣어줄 인덱스는 0이다.

            for (int i = 0; i < size ; i++) {
                if (cache[i] == task) {
                    idx = i;
                }
            }
            //캐시 메모리에 없는 task: 하나씩 뒤로 싹 밀어주기
            //캐시 메모리에 있으면 그곳부터 밀기
            if (idx == -1) {
                for (int i = size-1 ; i > 0; i--) cache[i] = cache[i-1];
            }
            for (int i = idx; i > 0; i--) cache[i] = cache[i-1];

            cache[0] = task;
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
