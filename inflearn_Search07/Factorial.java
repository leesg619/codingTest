package inflearn_Search07;
import java.util.Scanner;
public class Factorial {
    public static int fac(int n) {
        if (n==1) return 1;
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(fac(n));
        kb.close();
    }
}