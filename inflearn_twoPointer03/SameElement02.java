package inflearn_twoPointer03;

import java.util.*;

public class SameElement02 {
    
    public static ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int idx1 = 0;
        int idx2 = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(idx1 < n && idx2 < m) {
            if(arr1[idx1] == arr2[idx2]) {
                answer.add(arr1[idx1]);
                idx1 += 1;
                idx2 += 1;
            }
            else if(arr1[idx1] > arr2[idx2]) {
                idx2 += 1;
            }
            else if(arr1[idx1] < arr2[idx2]) {
                idx1 += 1;
            }
        }
        
        return answer;

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
		int[] arr1=new int[n];
		for(int i=0; i<n; i++){
			arr1[i]=kb.nextInt();
		}
        
        int m=kb.nextInt();
		int[] arr2=new int[m];
		for(int i=0; i<m; i++){
			arr2[i]=kb.nextInt();
		}

		for(int x : solution(n, arr1, m, arr2)){
			System.out.print(x+" ");
        }
        kb.close();
    }

}
