import java.util.*;

public class Peak10 {
    
    public static int solution(int n, int[][] arr) {
        int answer = 0;
        //int[] dx={-1, 0, 1, 0};
	    //int[] dy={0, 1, 0, -1};
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i+1][j] &&
                arr[i][j]>arr[i][j-1] && arr[i][j]>arr[i][j+1]) {
                    answer += 1;
                }
                /*
                boolean flag=true;
				for(int k=0; k<4; k++){
					int nx=i+dx[k];
					int ny=j+dy[k];
					if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
						flag=false;
						break;
					}
				}
				if(flag) answer++;
                */ 
            }
		}
        
        return answer;

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
		int[][] arr=new int[n+2][n+2];
		for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                arr[i][j]=kb.nextInt();
            }
		}
		System.out.print(solution(n, arr));
        kb.close();
    }

}
