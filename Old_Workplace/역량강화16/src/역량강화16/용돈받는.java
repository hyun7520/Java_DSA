package 역량강화16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 용돈받는 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		int[][] dp = new int[N+1][3];
				
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			//dp[1][0] = x; dp[1][1] = y; dp[1][2] = z;
			dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]) + x;
			dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2]) + y;
			dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1]) + z;
		}
		
		int ans = Math.max(dp[N][0], Math.max(dp[N][1], dp[N][2]));
		
		System.out.println(ans);

	}

}
