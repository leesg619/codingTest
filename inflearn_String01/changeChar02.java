package inflearn_String01;

import java.util.Scanner;

public class changeChar02 {
    public static String solution(String str) {
        String answer = "";
        for(char x: str.toCharArray()) {
            if(Character.isUpperCase(x)) {
                answer+=Character.toLowerCase(x);
            } else {
                answer+=Character.toUpperCase(x);
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
        kb.close();
    }
}
