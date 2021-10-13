package inflearn_Sort06;
import java.util.Scanner;

public class Sort0603 {
    public static int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int target = arr[i];
            for (int j = i; j > 0; j--) {
                if (target < arr[j - 1]) {
                   arr[j] = arr[j-1];
                   arr[j-1] = target;
                } else break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for (int num : solution(n, arr)) {
            System.out.print(num+" ");
        }
        kb.close();
    }
}
