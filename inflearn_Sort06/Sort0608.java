package inflearn_Sort06;
import java.util.*;

public class Sort0608 {
    public static int solution(int n, int m, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int low = 0;
        int high = n-1;

        for (int i = 0; i < n; i++) {
            int mid = (low + high) / 2;
            if (arr[mid] == m)  return mid+1;

            if (arr[mid] > m) {
                high = mid;
            } else if (arr[mid] < m){
                low = mid;
            }
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