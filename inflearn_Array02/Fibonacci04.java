package inflearn_Array02;

import java.util.*;

public class Fibonacci04 {
    
    public static ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(1);
        for(int i = 0; i < n-2; i++) {
            int a = answer.get(i);
            int b = answer.get(i+1);
            answer.add(a+b);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
		for(int x : solution(n)){
			System.out.print(x+" ");
        }
        kb.close();
    }

}
