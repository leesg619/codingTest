package inflearn_hash04;

import java.util.*;

public class Hash0403 {
    
    public static ArrayList<Integer> solution(int n, int k ,int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<k; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        answer.add(map.size());
        for(int i = 0; i<n-k; i++){ //sliding window (lt, rt 이용해도됨)
            // 삭제 : 만약 갯수 1개면 아예 키 삭제, 아니면 내비두기
            if(map.get(arr[i])==1) {
                map.remove(arr[i]);
            } else {
                map.put(arr[i], map.get(arr[i])-1);
            }
            // 추가 : getOrDefault로
            map.put(arr[i+k], map.getOrDefault(arr[i+k], 0)+1);
            answer.add(map.size());
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
		for(int x : solution(n, k, arr)){
			System.out.print(x+" ");
        }
        kb.close();
    }

}
