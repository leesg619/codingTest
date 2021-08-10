package inflearn_String01;
import java.util.Scanner;

public class FindString01 {
    public static int solution(String str, char t) {
        int answer= 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        // System.out.println(str+" "+ t);
        /*for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==t) answer++;
        }*/
        for(char x: str.toCharArray()) { //for-each는 String형그대로 불가!
            if(x==t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        kb.close();
        System.out.println(solution(str, c));
    }
}
