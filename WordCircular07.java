import java.util.Scanner;
//거꾸로해도 같은문자열인지 판단
public class WordCircular07 {
    public static String solution(String str) {
        // String tmp = new StringBuilder(str).reverse().toString();
        // if(str.equalsequalsIgnoreCase(tmp)) return "YES";
        // else return "NO";
        int lt = 0;
        int rt = str.length() - 1;
        str = str.toLowerCase();
        while(lt < rt) {
            if(str.charAt(lt) != str.charAt(rt)) {
                return "NO";
            }
            lt += 1;
            rt -= 1;
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
        kb.close();
    }
}
