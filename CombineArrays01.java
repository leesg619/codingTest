import java.util.*;

public class CombineArrays01 {
    
    public static ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int minIndex = Math.min(n, m);
        int idx1 = 0;
        int idx2 = 0;
        while(idx1 < minIndex && idx2 < minIndex) {
            if(arr1[idx1] >= arr2[idx2])
        }
        // 둘중에 배열 길이 작은 인덱스 설정후 둘중 안넘을때까지 while진행
        // 그후 for문으로 idx1 idx2 각자 길이만큼 채워주면 됨
        // 어차피 둘중에 먼저 끝난애는 for문 안돌테니까 두개 for문 추가해도됨.
        


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
