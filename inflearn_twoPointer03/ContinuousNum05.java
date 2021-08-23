package inflearn_twoPointer03;

import java.util.*;

public class  ContinuousNum05 {
    public static int solution(int n) {
        int answer = 0;
        int lt = 1, rt = 1;
        int sum = 0;
        while( rt <= (n/2)+2) {
            if(sum < n) {
                sum += rt;
                rt += 1;
            } else if(sum > n) {
                sum -= lt;
                lt += 1;
            } else if(sum == n) {
                answer += 1;
                sum += rt;
                rt += 1;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.print(solution(n));
        kb.close();
    }

}
