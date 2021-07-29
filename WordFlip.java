import java.util.ArrayList;
import java.util.Scanner;

public class WordFlip {
    public static ArrayList<String> solution(ArrayList<String> arr) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++) {
            String str = arr.get(i);
            String newStr = "";
            for(int j = str.length()-1; j >= 0; j--) {
                newStr += str.charAt(j);
            }
            answer.add(newStr);
        }
        return answer;
        /*
        ArrayList<String> answer=new ArrayList<>(); 
		for(String x : str){
			String tmp=new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer; */
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < num; i++ ) {
            String comp = kb.next();
            arr.add(comp);
        }
        for(String ans: solution(arr)) {
            System.out.println(ans);
        }
    }
}
