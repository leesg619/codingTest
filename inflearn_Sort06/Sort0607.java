package inflearn_Sort06;
import java.util.*;

public class Sort0607 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr.get(i).x +" "+ arr.get(i).y);
        }
    }
}

class Point implements Comparable<Point>{
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x==o.x) return this.y-o.y;  // 오름차순 원하면 this - o 가 음수가 되게 설계하면된다.
        else return this.x-o.x;
    }
}