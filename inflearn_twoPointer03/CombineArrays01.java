import java.util.*;

public class CombineArrays01 {
    
    public static ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int idx1 = 0;
        int idx2 = 0;
        while(idx1 < n && idx2 < m) {
            if(arr1[idx1] < arr2[idx2]) {
                answer.add(arr1[idx1]);
                idx1 += 1;
            }
            else if(arr1[idx1] > arr2[idx2]) {
                answer.add(arr2[idx2]);
                idx2 += 1;
            }
            else{
                answer.add(arr1[idx1]);
                answer.add(arr2[idx2]);
                idx1 += 1;
                idx2 += 1;
            }
        }
        for(int i = idx1; i < n; i++) answer.add(arr1[i]);

        for(int j = idx2; j < m; j++) answer.add(arr2[j]);
        // 둘중에 배열 길이 작은 인덱스 설정후 둘중 안넘을때까지 while진행
        // 그후 for문으로 idx1 idx2 각자 길이만큼 채워주면 됨
        // 어차피 둘중에 먼저 끝난애는 for문 안돌테니까 두개 for문 추가해도됨.
        return answer;

    }   //*****Arrays.sort 해봤자 최악의 경우 O(n^2) 가 됨 퀵정렬써도 O(nlogn)
    //그래서 이거는 쉽지만 두개의 포인터 써서 O(n) 으로 짤수있냐를 물어보는것

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
