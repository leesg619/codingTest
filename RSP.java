import java.util.*;

public class RSP {
    
    public static ArrayList<Character> solution(int n, int[] arr1, int[] arr2) {
        ArrayList<Character> answer = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int result = arr1[i]-arr2[i];
            if(result == 0) answer.add('D');
            if(result == 1 || result == -2) answer.add('A');
            if(result == 2 || result == -1) answer.add('B');
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
		int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++){
			arr1[i]=kb.nextInt();
		}
		for(int i=0; i<n; i++){
			arr2[i]=kb.nextInt();
		}
		for(char x : solution(n, arr1, arr2)){
			System.out.println(x);
		}
        kb.close();
    }

}
