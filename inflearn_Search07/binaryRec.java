package inflearn_Search07;
import java.util.Scanner;

public class binaryRec {
    public static void recursive(int n) {
        if (n == 0) {
            return;
        } else {
            recursive(n/2);
            System.out.print(n % 2);
        }
    }
//heap 들가는 순서 recursive(11)  recursive(5) rec(2) rec(1) //  sout 1 2%2 5%2  11%2
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        recursive(n);
        kb.close();
    }
}
