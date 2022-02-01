package inflearn_Greedy09;
import java.util.*;

class Time implements Comparable<Time>{
    public int t;
    public char status;
    public Time(int t, char status) {
        this.t = t;
        this.status = status;
    }

    @Override
    public int compareTo(Time o) { // 겹치는 시간대에 e 먼저 나와야 count 줄여준 후 최대 수용 인원 체크함. 매우중요 point
        if(t==o.t) return status - o.status;
        return t- o.t;
    }
}

public class G03 {

    public int greedy(ArrayList<Time> arr) {
        int answer = 0;
        int cnt = 0;
        Collections.sort(arr);

        for (Time time : arr) {
            if (time.status == 'e') cnt--;
            else cnt++;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        G03 T = new G03();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = kb.nextInt();
            int end = kb.nextInt();
            arr.add(new Time(start,'s'));
            arr.add(new Time(end,'e'));
        }
        System.out.println(T.greedy(arr));
    }
}