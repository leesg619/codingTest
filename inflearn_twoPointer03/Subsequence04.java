package inflearn_twoPointer03;

import java.util.*;

public class Subsequence04 {
    
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt=0, rt=0;
        int sum = 0;
        
        while(rt<n) {
            if(sum < m) {
                sum += arr[rt++];
            }
            else if(sum > m) {
                sum -= arr[lt++];
            }
            else {
                answer += 1;
                sum += arr[rt++];
            }
            if(lt > rt) rt = lt;
        } 
        //여기까지하고 rt(끝인덱스)가끝에도달했으므로 lt남은부분으로 while로 마무리
        while(lt<n) {
            if(sum < m) {
                break;
            }
            else if(sum > m) {
                sum -= arr[lt++];
            }
            else {
                answer += 1;
                break;
            }
        }
        return answer;
/**
 * int answer=0, sum=0, lt=0;
		for(int rt=0; rt<n; rt++){
			sum+=arr[rt];
			if(sum==m) answer++;
			while(sum>=m){
				sum-=arr[lt++];
				if(sum==m) answer++; 
			}
		}  //더 간단하게 만들기
 */
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