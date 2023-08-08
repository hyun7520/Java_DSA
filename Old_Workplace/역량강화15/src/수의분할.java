import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수의분할 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[n+1];
		int[] arr = new int[x];
		st = new StringTokenizer(bf.readLine());
		
		dp[0] = 1;
		int divide = (int) (Math.pow(10, 9) + 7);
		
		for(int i = 0; i < x; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i <= n; i++) {
			dp[i] = 0;
			for(int j = 0; j < x; j++) {
				if(i - arr[j] >= 0) {
					dp[i] += dp[i - arr[j]];
					dp[i] %= divide;
				}
			}
		}
		System.out.println(dp[n]);
	}

}
