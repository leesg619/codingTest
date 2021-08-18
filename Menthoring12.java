import java.util.*;

public class Menthoring12 {
    public static int solution(int n, int m, int[][] arr) {
        int answer = 0;        
        //각각 학생번호를 기준 잡고
        // 각 번호마다 list 만들어서 작은 애들 있으면 그녀석을 1더함
        for(int num = 1; num <= n; num++) {  

            int[] nums = new int[n+1];   //매 번호마다 고유의 배열 생성
            
            for(int j = 0; j < m; j++) {

                for(int k = 0; k < n; k++ ) {

                    if(arr[j][k] == num) {
                        for (int i = k+1; i < n; i++) {
                            nums[arr[j][i]]++;
                        }
                    }

                }
                for(int i = 1 ; i< n+1; i++) {
                    if (nums[i] == m) {
                        answer += 1;
                    } //m번의 시험에서 모두 이기면 정답에 추가
                }
            }
        }
        return answer;   // [0][1]  [0][2]  [0][3] [0][4]
    } // 풀이 2  n*n 쌍의 멘토 - 멘티 경우의 수 모두 일때를 각각 계산함. 당연히 4중for문이 됨 

    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
		}
		System.out.print(solution(n, m, arr));
        kb.close();
    }
}
