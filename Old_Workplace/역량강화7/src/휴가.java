import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ÈÞ°¡ {
	
	static int[][] arr; 
	static int N;
	static int max;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(bf.readLine());
		arr = new int[N+1][2];
		max = 0;

		for(int i = 1; i < N+1; i++) {
			st = new StringTokenizer(bf.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());	
		}
		dfs(1, 0);
		System.out.println(max);
	}

	private static void dfs(int today, int pay) {
		// TODO Auto-generated method stub
		
		if(today > N) {
			if(pay > max) max = pay;
			return;
		}
		else {
			if(today + arr[today][0] < N+1) {
				dfs(today + arr[today][0], pay + arr[today][1]);
			}
			dfs(today + 1, pay);
		}
	}
}

/* 
7
4 20
2 10
3 15
3 20
2 30
2 20
1 10

*/