package inflearn_Sort06;
import java.util.Scanner;

public class Sort0602 {
    public static int[] solution(int n, int[] arr) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
