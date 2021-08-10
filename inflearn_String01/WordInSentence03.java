package inflearn_String01;
import java.util.Scanner;

public class WordInSentence03 {
    public static String solution(String str) {
        String answer = "";
        String[] arr = new String[100];
        arr = str.split(" ");
        int maxLen = Integer.MIN_VALUE;
        int max = -1;
        for(int i = 0; i < arr.length; i++){
            if(maxLen < arr[i].length()) {
                max = i;
            }
        }
        answer = arr[max];
        return answer;
        /*
        		String answer="";
		int m=Integer.MIN_VALUE, pos;
		while((pos=str.indexOf(' '))!=-1){
			String tmp=str.substring(0, pos);
			int len=tmp.length();
			if(len>m){
				m=len;
				answer=tmp;
			}
			str=str.substring(pos+1);
		}
		if(str.length()>m) answer=str;
		return answer;
        */
    }
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
        kb.close();
    }
}
