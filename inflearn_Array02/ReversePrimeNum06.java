package inflearn_Array02;

import java.util.*;

public class ReversePrimeNum06 {
    
    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<StringBuilder> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        for(int x : arr){
            arr2.add(new StringBuilder(x+""));
        }
        for(StringBuilder s: arr2) {
            arr3.add(Integer.parseInt(s.reverse().toString()));
        }
        for(int num :arr3){
            if(num==1) continue;
			double sqrt = Math.sqrt(num);
            int cnt = 0;
            for(int i=2; i<=sqrt; i++) {
                if(num % i == 0) cnt +=1;
            }
            if(cnt == 0) answer.add(num);
        }
        return answer;
/**for(int i=0; i<n; i++){
			int tmp=arr[i];
			int res=0;
			while(tmp>0){
				int t=tmp%10;
				res=res*10+t;
				tmp=tmp/10;
			}
			if(isPrime(res)) answer.add(res);
		} */
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x : solution(n, arr)){
			System.out.print(x+" ");
        }
        kb.close();
    }

}
