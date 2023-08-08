import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 삼이하로분할 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(bf.readLine());
		
		int[] dp = new int[12];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(bf.readLine());
	
			for(int j = 4; j <= N; j++) {
				dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
			}
			System.out.println(dp[N]);
		}
	}
}
