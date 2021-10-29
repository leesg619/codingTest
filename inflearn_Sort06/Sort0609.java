package inflearn_Sort06;
import java.util.*;
public class Sort0609 {
    public static int solution(int n, int m, int[] arr){
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        boolean befosame = false;

        while (lt <= rt) {
            int tot = 1, sum = 0; // dvd개수
            int mid = (lt+rt) / 2; //dvd 의 최소용량크기 지정

            for (int x : arr) {
                if (sum + x > mid) {
                    tot++;
                    sum =x;
                }
                else sum+=x;
            }

            if (tot <= m ){
                answer = mid;
                rt = mid - 1;
            }

            else{ lt = mid + 1;}

        }
        return answer;
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.print(solution(n, m, arr));
    }
}
