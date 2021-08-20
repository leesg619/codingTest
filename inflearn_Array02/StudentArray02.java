import java.util.*;
class StudentArray02 {
  public static int solution(int n, int[] arr){
		int answer = 1; //맨앞포함하고시작
    int max = arr[0];
		for(int i=1; i<n; i++){
			if(max < arr[i]){
        max = arr[i];
        answer += 1;
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