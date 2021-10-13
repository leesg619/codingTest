package inflearn_Sort06;

import java.util.Scanner;
public class Sort0601 {

    public static int[] solution(int n, int[] arr) {
        int temp = 0;
        int min = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            min = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    idx = j;
                }
            }
            temp = arr[i];
            arr[i] = min;
            arr[idx] = temp;
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
