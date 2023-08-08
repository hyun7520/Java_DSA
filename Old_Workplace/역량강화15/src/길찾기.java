import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ±Ê√£±‚ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		char[][] arr = new char[N+1][N+1];
		int[][] dp = new int[N+1][N+1];
		
		for(int i = 1; i <= N; i++) {
			String line = bf.readLine();
			for(int j = 1; j <= N; j++) {
				arr[i][j] = line.charAt(j-1);
			}
		}
		int divide = (int) (Math.pow(10, 9) + 7);
		
		if(arr[1][1] == '.') dp[1][1] = 1;
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				if(i == 1 && j == 1) continue;
				if(arr[i][j] == '*') continue;
				dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % divide;
			}
		}
		
		System.out.println(dp[N][N]);
	}

}
