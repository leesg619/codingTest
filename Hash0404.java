import java.util.*;

public class Hash0404 {
      
    public static int solution(String a, String b) {
        int answer = 0;
        // str2의 길이만큼 lt, rt 만들고 슬라이딩윈도우
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char x : b.toCharArray()){
			map2.put(x, map2.getOrDefault(x, 0)+1);
		}
        for(int i = 0; i<b.length()-1; i++) {
            map1.put(a.charAt(i), map1.getOrDefault(a.charAt(i), 0) +1);
        }
        int lt = 0;
        for(int rt = b.length()-1; rt< a.length(); rt++) {
            map1.put(a.charAt(rt), map1.getOrDefault(a.charAt(rt), 0) +1);
            if(map1.equals(map2)) answer++;
            map1.put(a.charAt(lt), map1.get(a.charAt(lt)) -1);
            if(map1.get(a.charAt(lt)) == 0)  map1.remove(a.charAt(lt));
            // 0 일때 remove 해주는 이유는 키값이 남아있으면 value 0 으로 남아있기때문에
            // equals 비교하면 불일치됨 ( ex a: 1 b: 1 c: 1 A: 0  과 a:1 b:1 c:1)
            lt++;

        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
		String b=kb.next();
		System.out.print(solution(a, b));

        kb.close();
    }

}
