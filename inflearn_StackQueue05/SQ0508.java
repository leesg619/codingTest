package inflearn_StackQueue05;

public class SQ0508 {

    public static int solution(int n, int k, int[] arr) {
        int aim = arr[k];
        int now_index = k;
        int max_index = n-1;
        Queue<Character> q1 = new LinkedList<>();
        for (int i : arr) q1.offer;


        return 100;

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(solution(n, k, arr));
        kb.close();
    }
}
