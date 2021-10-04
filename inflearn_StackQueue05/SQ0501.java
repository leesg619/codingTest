package inflearn_StackQueue05;
import java.util.*;

public class SQ0501 {

    public static String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) { return "NO"; }
        return answer;

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(solution(str));
        kb.close();
    }

}