package inflearn_DP10;
import java.util.*;
public class Main {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int[] dy = new int[n]; // dy배열 : 해당 인덱스에서 끝나는, 만들 수 있는 증가수열의최대길이
        dy[0] = 1;

        for(int i=1; i<n; i++) {
            int tmp = arr[i];
            int maxVal = 1; //앞선 숫자들 보다 제일 작을 경우 dy[i] = 1 이 되어야 하기 때문
            for(int j=0; j<i; j++) {
                if(arr[j] < tmp) {
                    maxVal = Math.max(maxVal, dy[j]+1);
                }
            }
            dy[i] = maxVal;
            answer = Math.max(answer, dy[i]); //최댓값 업데이트 (dy배열 중 최댓값이 정답이므로)
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, arr));
    }
}