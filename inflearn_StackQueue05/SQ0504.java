package inflearn_StackQueue05;
import java.util.*;

public class SQ0504 {

    public static int solution(String str) {
        int answer = 0;
//        Character.isDigit(x)
        Stack<Integer> stack = new Stack<>();
//숫자면 쳐넣고 연산부호면 두개 꺼내서 계산하고 다시 넣고 다음 루프
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                int temp = Integer.parseInt(String.valueOf(c));  // === stack.push(x-48);  아스키코드 고려해서 48뺴줘야됨. '0' == 48 , '1'==49
                stack.push(temp);
            } else {  // 첫번쨰 뺀게 연산자 기준 오른쪽, 두번째 뺀게 왼쪽
                int tmp1 = stack.pop();
                int tmp2 = stack.pop();
                if ( c == '+') { stack.push(tmp2 + tmp1); }
                if ( c == '-') { stack.push(tmp2 - tmp1); }
                if ( c == '*') { stack.push(tmp2 * tmp1); }
                if ( c == '/') { stack.push(tmp2 / tmp1); }
            }
        }
        answer = stack.get(0);
        return answer;

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(solution(str));
        kb.close();
    }

}
