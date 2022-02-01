package inflearn_DFSBFS08;
import java.util.ArrayList;
import java.util.Scanner;

class Point {
    public int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Pizza15 {
    static int n, m, answer= Integer.MAX_VALUE;;
    static ArrayList<Point> house, pizza;
    static int[] combi;

    public void solution(int[] ch) {
        int sum = 0;
        int[] dis = new int[house.size()];

        for (int n : ch) { //각 피자집 하나씩 꺼내면서 , 각집마다 최소 distance들을 저장.
            Point p = pizza.get(n);

            for (int i = 0; i < house.size(); i++) {
                Point h = house.get(i);
                int distance = Math.abs(p.x - h.x) + Math.abs(p.y - h.y);

                if (dis[i] == 0) dis[i] = distance;
                else dis[i] = Math.min(dis[i], distance);
            }


        }

        for (int distance : dis) sum += distance;

        answer = Math.min(answer, sum);
    }

    public void  dfs(int L, int s) {  //피자집들 중 m개 뽑기 (Combination)
        if (L == m) {
            solution(combi);
        } else {
            for (int i = s; i < pizza.size(); i++) {
                combi[L] = i;
                dfs(L+1, i+1);

            }
        }
    }

    public static void main(String[] args) {
        Pizza15 T = new Pizza15();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();

        house = new ArrayList<>();
        pizza = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int inputs = kb.nextInt();
                if (inputs == 2) pizza.add(new Point(i,j));
                if (inputs == 1) house.add(new Point(i,j));

            }
        }
        combi = new int[pizza.size()];

        T.dfs(0, 0);
        System.out.println(answer);

    }
}