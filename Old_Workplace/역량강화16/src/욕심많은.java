import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ¿å½É¸¹Àº {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N+1][2];
		long[][] dp = new long[N+1][W+1];
		
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(bf.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i <= W; i++) {
			dp[0][i] = -1L;
		}
		
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j <= W; j++) {
				dp[i][j] = dp[i-1][j];
				if(j - arr[i][0] >= 0) {
					dp[i][j] = Math.max(dp[i][j], dp[i-1][j-arr[i][0]] + arr[i][1]);
				}
			}
			
		}
		long ans = 0;
		for(int i = 0; i <= W; i++) {
			ans = Math.max(dp[N][i], ans);
		}
		System.out.println(ans);
	}

}
