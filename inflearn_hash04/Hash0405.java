package inflearn_hash04;

import java.util.*;

public class Hash0405 {
    
    public static int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        int lt = 0, mt = 1, rt = 2;
        for(lt = 0; lt< n; lt++) {  //n 까지로 해도 밑에서 조건안만족해서 for문 안돌아감
            for(mt = lt + 1; mt < n; mt++) {
                for(rt = mt + 1; rt < n; rt++) {
                    Tset.add(arr[lt] + arr[mt] + arr[rt]);
                }
            }
        }
        int cnt = 0;
        for(int x: Tset) {
            cnt++;
            if(cnt == k ) return x;
        }
        return answer;
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
