package inflearn_twoPointer03;
import java.util.*;

public class MaxSales03 {
    
    public static int solution(int n, int m, int[] arr) {
        int max = 0;
        // for(int i = 0; i <= n-m; i++) {
        //     int temp = 0;
        //     for(int j = i; j < m+i; j++) {
        //         temp += arr[j];
        //     }
        //     if(max < temp) max = temp;
        // }  timeout
        int sum = 0;
        for(int i = 0 ; i<m; i++) {
            sum += arr[i];
        }
        max = sum;
        int k = m;
        while(k < n) {
            sum = sum + arr[k] - arr[k-m];
            max = Math.max(sum, max);
            k++;
            
        }
        return max;
        //맨처음 0~m 만큼 구하고 맨앞빼고 맨뒤 그다음수를 더하면서 진행
        //이것을 sliding Window라고 하며, 중요한개념인듯!
        //이중 반복 들어가면 바로 O(NK) 로 Timeout나옴
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
        System.out.print(solution(n, m, arr));
        kb.close();
    }

}
