package 역량강화6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nqueen {
	
	static int[] arr;
	static int N;
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(bf.readLine());
		arr = new int[N+1];
		
		dfs(1);	
		
		System.out.println(cnt);

	}
	public static void dfs(int col) {
		if(col == N + 1) {
			cnt++;
			return;
		}
		for(int i = 1; i <= N; i++) {
			boolean atk = true;
			for(int j = 1; j < col; j++) {
				if(i == arr[j] || j - arr[j] == col - i || j+ arr[j] == col+i) {
					atk = false;
				}
			}
			if(atk) {
				arr[col] = i;
				dfs(col + 1);
				arr[col] = 0;
			}
		}
	}

}
