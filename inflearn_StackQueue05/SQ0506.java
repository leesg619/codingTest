package inflearn_StackQueue05;

import java.util.*;

public class SQ0506 {
    public static int solution(int n, int k) {

        int temp = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) queue.add(i);

        while (true) {
            temp += 1;
            if (temp % k != 0) queue.add(queue.poll());
            else {
                if (queue.size() != 1) {
                    queue.poll();
                } else return queue.poll();
            }
        }

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(solution(n, k));
        kb.close();
    }
}
