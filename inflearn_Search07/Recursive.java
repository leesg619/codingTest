package inflearn_Search07;
import java.util.*;

public class Recursive {
//    자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력
    public static void rec(int n) {
        if (n==0) return;
        else{ 
            rec(n-1);
            System.out.print(n+" ");
            // stack frame에 따라 sout을 뒤에넣어야 1 부터출력
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        rec(n);
        kb.close();
    }
}
