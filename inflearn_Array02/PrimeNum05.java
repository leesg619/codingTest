package inflearn_Array02;

import java.util.*;

public class PrimeNum05 {
    
    public static int solution(int n) {
        int answer = 0;

        for(int i = 2; i <= n; i++) {
            int temp = 0;
            double sqrt = Math.floor(Math.sqrt(i));
            for(int num = 1; num <= sqrt; num++) {
                if(i%num == 0) {
                    temp += 1;
                }
            }
            if(temp == 1) {
                answer+=1;
            }
        }
        return answer;
        //에라토스테네스 체 이용
        /*
        int[] ch = new int[n+1];  //0으로초기화
        for(int i=2; i<=n; i++) {
            if(ch[i]==0){
                answer++;
                for(int j=i; j<=n; j=j+i) { //만약 2의배수면 2씩증가하면서 배열ch인덱스에 1씩증가
                    ch[i]+=1;
                }
            }
        }*/
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.print(solution(n));
        kb.close();
    }

}
