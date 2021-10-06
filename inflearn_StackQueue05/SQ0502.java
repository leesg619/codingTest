package inflearn_StackQueue05;

import java.util.*;

public class SQ0502 {

    public static String solution(String str) {

        String answer = "";
        Stack<Character> stack1 = new Stack<>();

        for (char c : str.toCharArray()) {
            if (stack1.isEmpty()) {  //비었으면
                if (c == '(') stack1.push(c);
                else answer += (c+"");
            }

            else {
                if (c == ')') stack1.pop();
                else if(c == '(') stack1.push(c);
                else continue;
            }
        }
        return answer;
/*
        // 다른 답 : 일단 다 넣고 ) 만나면 스택에서 ( 나올때가지 for문으로 pop시키면 결국 남는게 정답임
        for (char c : str.toCharArray()) {
            if (c == ')') {
                while (stack1.pop() != '(') {}
            } else {
                stack1.push(c);
            }
        }
        for (Character c : stack1) {
            answer+=""+c;
        }
        return answer;
*/
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(solution(str));
        kb.close();
    }
}
