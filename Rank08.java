import java.util.*;

public class Rank08 {
    
    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(Integer.MAX_VALUE);
        for(int x: arr) {
            arr2.add(x);
        }
        Collections.sort(arr2, Collections.reverseOrder());
        for(int num: arr) {
            answer.add(arr2.indexOf(num));
        }
        return answer;
    } // 같은 점수 여러개: 높은 등수로 동일 처리함(공동1등 시  1등 1등 1등 4등)
    //indexOf메소드는 제일 앞부터 검사해서 찾기 때문에 문제 요구사항을 바로 만족한다.
/** 2중for문
 int[] answer = new int[n];
		for(int i=0; i<n; i++){
			int cnt=1;
			for(int j=0; j<arr.length; j++){
				if(arr[j]>arr[i]) cnt++;
			}
			answer[i]=cnt;
		}
		return answer;
 */
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
