package inflearn_StackQueue05;
import java.util.*;

public class SQ0508 {

    public static int solution(int n, int k, int[] arr) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        //해쉬로 위험도 저장하는 방법도있고 아예 Person 클래스 객체 생성해도됨
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) map.put(i, arr[i]);
        for (int i = 0; i < n; i++) q.offer(i);

        while (q.contains(k)) {
            int temp = q.poll();
            boolean ok = true;

            for (int num : q) {
                if (map.get(temp) < map.get(num)) {
                    q.offer(temp);
                    ok = false;
                    break;
                }
            }

            if (ok) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(solution(n, m, arr));
        kb.close();
    }
}
