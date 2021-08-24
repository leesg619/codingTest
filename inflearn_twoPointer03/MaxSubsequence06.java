package inflearn_twoPointer03;

import java.util.*;

public class MaxSubsequence06 {
    
    public static int solution(int n, int k, int[] arr) {
        int max = 0;
        int idx=0;
        int sum = 0;
        // 0의 위치인덱스만 arraylist에 넣어서 k개의 차이만큼 떨어진 거리 구하기
        //무조건 연속된 0을 바꿔줘야 1의 최대길이가 나올수있단것을 명심하자
        // 근데 만약에 k보다 0이 적으면 답은 걍 n임
        int[] zero = new int[n];
        int length = 0;
        for(int i = 0; i<n; i++) {
            if(arr[i] == 0) {
                zero[idx++] = i;
                length++;
            }
        }
        // for(int x : zero) System.out.println(x + " ");
        if(zero.length < k) return n;
        
        for(int i = 0; i < length-k; i++) {
            sum = zero[i+k-1] - zero[i] + 1;
            int plus1 = ((i == 0) ? zero[i] : zero[i]-zero[i-1]-1);
            int plus2 = ((i == length-1) ? n-zero[i]-1 : zero[i+k]-zero[i+k -1]-1);
            sum = sum + plus1 + plus2;
            // System.out.println("plus1 : " + plus1 + "plus2 : " + plus2 +"sum : "+ sum);
            
            max = Math.max(sum, max);
        }
        // 8 1
        //1 1 0 0 1 1 0 1
        return max;
/**int answer=0, cnt=0, lt=0;
		for(int rt=0; rt<n; rt++){
			if(arr[rt]==0) cnt++;
			while(cnt>k){
				if(arr[lt]==0) cnt--;
				lt++;
			}
			answer=Math.max(answer, rt-lt+1);
		}
		return answer; 풀이 계속 더 보기 */
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
        System.out.print(solution(n, k, arr));
        kb.close();
    }

}
