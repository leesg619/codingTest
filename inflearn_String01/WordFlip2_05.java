package inflearn_String01;
import java.util.Scanner;

public class WordFlip2_05 {
    public static String solution(String str) {
        char[] arr = str.toCharArray();

        int lt = 0, rt = str.length()-1;
        while(lt<rt) {
            if(!Character.isAlphabetic(arr[lt])) lt++;
			else if(!Character.isAlphabetic(arr[rt])) rt--;
            else {
                char temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;
                lt += 1;
                rt -= 1;
            } 
        }
        String answer = String.valueOf(arr);
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
        kb.close();
    }
}
