package inflearn_hash04;

import java.util.*;

public class Hash0402 {
    
    public static String solution(String str1, String str2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(char x: str1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }
        for(char x: str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }
        //하나씩 뽑으면서 다른 한쪽에 키,밸류 똑같이 있는지 확인
        for(char x: map1.keySet()) {
            if(!map2.containsKey(x) || !map2.containsValue(map1.get(x))) {
                return "NO";
            }
        }
        return "YES";

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str1=kb.next();
        String str2=kb.next();
		System.out.print(solution(str1, str2));
        kb.close();
    }

}
