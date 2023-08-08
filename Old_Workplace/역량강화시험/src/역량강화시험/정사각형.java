package 역량강화시험;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정사각형 {
	
	static int[][] arr;
	static int N, M, ans, max, temp;
	static int dx[] = {-1, 0, 1, 0}; 
	static int dy[] = {0, -1, 0, 1};
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr= new int[N][M];
		for(int i = 0; i < N; i++) {
			String line = bf.readLine();
			for(int j = 0; j < M; j++) {
				arr[i][j] = line.charAt(j) - '0';
			}
		}
		dfs(0,0);
	}

	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
		int temp = arr[x][y];
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(arr[i][j] == temp)
			}
		}
		
	}
}
