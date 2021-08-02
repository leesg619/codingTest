import java.util.Scanner;

public class Palindrome08 {
    
    public static String solution(String str) {
        String answer ="";
        //char array에 넣고, stringBuiler만들고 뒤집고비교
        char[] arr = str.toLowerCase().toCharArray();
        for(char x: arr) {
            if(Character.isAlphabetic(x)) answer += x;
        }
        String tmp = new StringBuilder(answer).reverse().toString();
        if(tmp.equals(answer)) return "YES";
        else return "NO";
        /*str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(answer).reverse().toString();
        */
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
        kb.close();
    }

}
