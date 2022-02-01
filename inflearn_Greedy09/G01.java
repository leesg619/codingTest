package inflearn_Greedy09;
import java.util.Arrays;
import java.util.Scanner;

class Profile implements Comparable<Profile>{
    int h, w;
    public Profile(int h , int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Profile o) {
        return o.h - h;
    }
}
public class G01 {
    static int n;
    static Profile[] arr;

    public int greedy() {
        int answer = 0;
        Arrays.sort(arr);

        int maxw = Integer.MIN_VALUE;
        for (Profile profile : arr) {
            if (profile.w > maxw) {
                maxw = profile.w;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        G01 T = new G01();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        arr = new Profile[n];
        for (int i = 0; i < n; i++) {
            int height = kb.nextInt();
            int weight = kb.nextInt();
            arr[i] = new Profile(height, weight);
        }
        System.out.println(T.greedy());
    }
}