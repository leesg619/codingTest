package inflearn_StackQueue05;

import java.util.*;

public class SQ0503 {
    public static int solution(int n, int m, int[][] arr, int[] moves) {
        int answer = 0;
        int[] nums = new int[n];  //각 라인별 현재 인형의 개수를 저장할 nums를 따로 만들어줬음.
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int num = n;
            for (int j = 0; j < n; j++) {
                if (arr[j][i] == 0) num -= 1;
            }
            nums[i] = num;
        }

        for (int i = 0; i < m; i++) {
            int now = moves[i]-1;  //옮길녀석의 두번째인덱스
            if (nums[now] > 0) {

                int temp = arr[n-nums[now]][now];   //복잡해보이지만 해당 줄의 맨위 인형 빼오는거임
                nums[now]-=1;  // 해당 줄의 인형 개수 줄여주기

                if(!stack.isEmpty() && stack.peek() == temp) {
                    answer += 2;
                    stack.pop();
                } else{  //isEmpty 거나 스택 비교해서 temp가 아니면 push하고 다음반복진행
                    stack.push(temp);
                }

            }

            else continue;   // 크레인 해당 줄에 옮길애가 없을때는 다음 move
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        int m=kb.nextInt();
        int[] moves = new int[m];
        for (int i=0; i<m; i++){
            moves[i]=kb.nextInt();
        }
        System.out.println(solution(n, m, arr, moves));
        kb.close();
    }

}

