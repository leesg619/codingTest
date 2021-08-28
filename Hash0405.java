import java.util.*;

public class Hash0405 {
    
    public static int solution(int n, int k, int[] arr) {
        int answer = 0;
        ArrayList<Integer> lists = new ArrayList<>();
        for(int x: arr) lists.add(x);
        lists.sort(Collections.reverseOrder());
        ArrayList<Integer> results = new ArrayList<>();
        HashMap<Integer, Integer> map= new HashMap<>();

        int lt = 0, mt = 1, rt = 2;
        for(lt = 0; lt< n-2; lt++) {

            for(mt = lt + 1; mt < n-1; mt++) {

                for(rt = mt + 1; rt < n; rt++) {
                    int temp = arr[lt] + arr[mt] + arr[rt];
                    results.add(temp);
                }
            }
        }

        results.sort(Collections.reverseOrder());
        for(int x: results) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int temp = 0;
        //키셋 잘 넣었고 이거 망했으니까 해쉬로 k 좀 계산해서 results로 리턴해보기

        for(int x : map.keySet()) {
            if(map.get(x) > 1) {
                k += map.get(x)-1;
            }
        }

        if(results.size() < k) return -1;
        answer = results.get(k);
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.print(solution(n, k, arr));

        kb.close();
    }

}
