import java.util.*;

public class Hash0401 {
    
    public static char solution(int n, String s) {
        char answer= ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x: s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) +1);
        }
        int max=0;
        for(char x: map.keySet()) {
            if(map.get(x) >= max) {
                max = map.get(x);
                answer = x;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
		String s = kb.next();
        System.out.print(solution(n, s));
        kb.close();
    }

}
