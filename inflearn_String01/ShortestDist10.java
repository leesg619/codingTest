import java.util.ArrayList;
import java.util.Scanner;

public class ShortestDist10 {
    
    public static void solution(String str, char chr) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == chr) arr.add(i);
        }
        for(int i = 0; i < str.length(); i++) {
            int dist = Integer.MAX_VALUE;
            for(int idx: arr) {
                if(Math.abs(idx-i) < dist) {
                    dist = Math.abs(idx-i);
                }
            }
            System.out.print(dist+" ");
        }
        //arraylist 만들고 알파벳 위치의 인덱스만 저장해가지고 
        //foreach로 꺼내서 distance (abs절댓값메소드이용) 최솟값을구함
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char chr = kb.next().charAt(0);
        solution(str, chr);
        kb.close();
    }

}

/*
int[] answer=new int[s.length()]; //왼쪽에서부터 거리 구하여 배열에넣고
//그 배열로 오른쪽에서부터거리구하면서 기존 배열 값이랑 둘중 작은값이랑비교하면서 넣기
// 1번째 결과 :1001 0 1 2 3 0 1 2 3 4 0  , 2번째 : 제일오른쪽부터 바꿔
		int p=1000;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)==t){
				p=0;
				answer[i]=p;
			}
			else{
				p++;
				answer[i]=p;
			}
		}
		p=1000;
		for(int i=s.length()-1; i>=0; i--){
			if(s.charAt(i)==t) p=0;
			else{
				p++;
				answer[i]=Math.min(answer[i], p);
			}
		}
		return answer;
         */