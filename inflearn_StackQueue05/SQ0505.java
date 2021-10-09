package inflearn_StackQueue05;
import java.util.*;

public class SQ0505 {
    public static int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        //( 가 스택에 쌓인 개수가 중요함.'(' 만을 저장할 것
        // ) 를 만나면 바로 앞에 나온게 '(' 이었으면 레이저 처리 - '(' 빼면서 스택의 쌓여있는 '(' 개수만큼 answer증가시킨다.
        // ')' 이었으면 막대기가 하나 끝나는 것이기 떄문에 스택에서 '(' 빼면서 1 만큼 answer를 증가시킨다.
        // 예시 그림을 참고하면 더 쉽게 이해가 가능하다.

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push(str.charAt(i));

            else {
                if (str.charAt(i-1) == '(') {
                    stack.pop();
                    answer += stack.size();
                }
                if (str.charAt(i-1) == ')') {
                    stack.pop();
                    answer += 1;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(solution(str));
        kb.close();
    }
}
