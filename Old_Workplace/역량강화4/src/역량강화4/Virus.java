package 역량강화4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Virus {
	
	public static int arr[][];
	public static int virus[];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(bf.readLine());
		int M = Integer.parseInt(bf.readLine());
		arr = new int[N+1][N+1];
		virus = new int[N+1];
		
		for(int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] =1;
		}
		dfs(1);
		
		int cnt = 0;
		for(int i =2; i <= N; i++) {
			if(virus[i] == 1) cnt++;
		}
		
		System.out.println(cnt);
		
	}
	public static void dfs(int i) {
		virus[i] = 1;
		for(int j = 1; j < arr.length; j++) {
			if(arr[i][j] == 1 && virus[j] == 0) {
				dfs(j);
			}
		}
	}
}
