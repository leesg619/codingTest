package inflearn_StackQueue05;
import java.util.*;
public class SQ0507 {

    public static String solution(String req, String all) {
        Queue<Character> q1 = new LinkedList<>();
        for (char c : all.toCharArray()) q1.add(c);

        for (char c : req.toCharArray()) {
            if (!q1.contains(c)) return "NO";
            while (q1.contains(c)) {
                System.out.println("q1.peek() = " + q1.poll());
            }
        }
        return "YES";
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String req=kb.next();
        String all=kb.next();
        System.out.println(solution(req, all));
    }
}
