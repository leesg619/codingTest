import java.util.Scanner;

public class CompressString11 {
    
    public static String solution(String str) {
        String answer ="";

        //새로운기준 변수 정하고, 
        //새로운 문자열에 바로추가 후에 반복횟수변수1증가
        //다음거 또 있으면 변수안변하고 반복횟수변수만증가
        //새로운게 오면 그동안반복한횟수추가하고 변수도바꾸고,반복횟수도초기화
        char temp = '0';
        int cnt = 1;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != temp) { //바로 전거랑 다르면?
                if(cnt > 1) answer+=cnt; //그동안반복했던 숫자 출력 (1은 생략)

                answer+=str.charAt(i); //다음문자 출력
                temp = str.charAt(i); //다음문자로 TEMP도 바꿈
                cnt = 1;   //다시 cnt = 1
            }
            else { //바로전이랑 같으면
                cnt += 1;
                if(i == str.length()-1) answer+=cnt;   //맨마지막처리
            }
        }
        return answer;
        /*
         i , i +1 index 비교하면 더 쉽게 풀이가능
         (맨끝인덱스는 오류막아야되니까 문자열끝에 ' ' 추가하고 str.length()-1 번 진행하면됨)

        */
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
        kb.close();
    }

}