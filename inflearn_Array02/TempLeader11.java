import java.util.*;

public class TempLeader11 {
    
    public static int solution(int n, int[][] arr) {
        int answer = 0;
        int max = 0, maxIndex= 0;
        int[] nums = new int[n]; //nums 1차원배열에다가 학생 겹치면 바로바로 추가해주고 뒤에서 max를 통한 학생번호 return
        // 1, 2번학생  1학년~5학년 비교 , 그다음은 2번,3번비교 ...
        for(int i=0; i<n-1; i++){
            for(int j= i+1; j < n; j++) {
                for(int k=0; k<5; k++){

                if(arr[i][k] == arr[j][k]) {
                    nums[i] += 1;
                    nums[j] +=1;   //각 한번이라도 같은반했으면 둘다 1추가하고 다음반복시작
                    break;
                }
            }
        }
    }
        //모두 다 0번이면 1번학생을 출력해야되니까 그것도 신경썼어야함(maxIndex=-1이아니고 0으로 초기화하고 시작)
        for(int i=0; i<n; i++) {  // 최댓값과 그 인덱스 저장
            if(max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }
        answer = maxIndex+1; //배열 0부터시작했었음
        return answer;

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
		int[][] arr=new int[n][5];
		for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                arr[i][j]=kb.nextInt();
            }
		}
		System.out.print(solution(n, arr));
        kb.close();
    }

}
