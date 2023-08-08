import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class M보다큰구간 {
	
	static int[] arr;
	static int N;
	static int M;
	static int cnt;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int M = Integer.parseInt(bf.readLine());
		
		dfs(0);
		
		System.out.println(cnt);
	}

	private static void dfs(int i) {
		// TODO Auto-generated method stub
		int temp = 0;
		for(int j = i; j < N; j++) {
			temp += arr[j];
			if(temp > M) cnt++;
		}
		dfs(i+1);
	}

}
