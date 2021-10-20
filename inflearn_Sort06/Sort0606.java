package inflearn_Sort06;

import java.util.*;

public class Sort0606 {
    public ArrayList<Integer> solution(int n, int[] arr){



    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : solution(n, arr)) System.out.print(x+" ");
    }
}
