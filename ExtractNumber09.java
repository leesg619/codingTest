import java.util.Scanner;

public class ExtractNumber09 {
    
    public static int solution(String str) {
        String tmp ="";
        for(char x: str.toCharArray()){
            if(Character.isDigit(x)) tmp+=x;
        }
        int answer = Integer.parseInt(tmp);
        return answer;
        /*
         int answer = 0;
         for(char x : s.toCharArray()){
         if(x>=48 && x<=57) answer=answer*10+(x-48);
         } 
         */
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
        kb.close();
    }

}
