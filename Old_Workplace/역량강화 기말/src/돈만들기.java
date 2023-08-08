import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class µ·¸¸µé±â {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[x];
		int[] dp = new int[n+1];
		
		dp[0] = 1;

		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < x; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < x; i++) {
			for(int j = arr[i]; j <= n; j++) {
				dp[j] += dp[j - arr[i]];
			}
		}
		
		if(dp[n] == 0) System.out.println(-1);
		System.out.println(dp[n] - 1);
	}

}
