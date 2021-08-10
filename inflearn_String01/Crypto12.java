package inflearn_String01;
import java.util.Scanner;

public class Crypto12 {
    
    public static String solution(int n, String str) {
        String answer ="";
        str = str.replace('#', '1').replace('*', '0');
        for(int i = 0; i < str.length(); i = i+7) {
            String sub = str.substring(i, i+7);
            
            char  chr = (char)Integer.parseInt(sub, 2);
            answer += chr;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(solution(n, str));
        kb.close();
    }

}
