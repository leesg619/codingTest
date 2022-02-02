package inflearn_Greedy09;
import java.util.*;

class Lecture implements Comparable<Lecture> {
    public int pay, time;
    public Lecture(int pay, int time) {
        this.pay = pay;
        this.time = time;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.time - time;
    }
}
public class G04 {
    static int maxDay = Integer.MIN_VALUE;

    public int greedy(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder()); //reverseOrder걸어야 큰값꺼내는 우선순위큐
        Collections.sort(arr);
        int j = 0;
        for (int i = maxDay; i >= 1; i--) {
            for (; j < arr.size(); j++) {
                if (arr.get(j).time < i) break;
                pQ.offer(arr.get(j).pay);
            }
            if (!pQ.isEmpty()) answer += pQ.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        G04 T = new G04();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int pay = kb.nextInt();
            int time = kb.nextInt();
            if (maxDay < time) maxDay = time;
            arr.add(new Lecture(pay, time));
        }
        System.out.println(T.greedy(arr));
    }
}
