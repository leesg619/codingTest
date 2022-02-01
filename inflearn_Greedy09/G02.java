package inflearn_Greedy09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    int st, end;
    public Time(int st, int end) {
        this.st = st;
        this.end = end;
    }
    @Override
    public int compareTo(Time o) {
        if (o.end - end != 0) {
            return end - o.end;
        } else {
            return st - o.st;
        }
    }
}

public class Main {

    public int greedy(ArrayList<Time> arr) {
        int answer = 1;
        Collections.sort(arr);

        int last = arr.get(0).end;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).st < last) continue;

            last = arr.get(i).end;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = kb.nextInt();
            int end = kb.nextInt();
            arr.add(new Time(start, end));
        }
        System.out.println(T.greedy(arr));
    }
}