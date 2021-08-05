import java.util.Scanner;
//문자열의 중복된 문자를 제거하는문제
public class WordDuplication06 {
    public static String solution(String str) {
        String answer ="";
        char[] arr = str.toCharArray();
        for(int i = 0; i < str.length(); i++) {
            if(answer.indexOf(arr[i]+"") < 0) {
                answer += arr[i];
            }
        }
        /*for(int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }*/
        // indexOf는 맨앞에서부터 찾기때문에 해당 인덱스번호와 indexOf 의 결과가 같다면 중복 전이므로 추가한다. 
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
        kb.close();
    }
}
