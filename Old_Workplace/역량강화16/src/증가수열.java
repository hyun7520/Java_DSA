import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 증가수열 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int ans = 0;
		int[] arr = new int[N+1];
		int[] dp = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i = 1; i <= N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N; i++) {
			dp[i] = 1;
			for(int j = 1; j <= N; j++) {
				if(arr[j] < arr[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
			}
			ans = Math.max(dp[i], ans);
		}
	System.out.println(ans);
	}

}
