import java.util.*;

public class ScoreCalc07 {
    
    public static int solution(int n, int[] arr) {
        int answer = 0;
        int temp = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                temp += 1;
                answer += temp;
            }
            if(arr[i] == 0) {
                temp = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.print(solution(n, arr));
        kb.close();
    }

}
