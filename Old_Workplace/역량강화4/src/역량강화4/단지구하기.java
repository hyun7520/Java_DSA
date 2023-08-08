package 역량강화4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 단지구하기 {

	static int dx[] = {-1, 0, 1, 0}; 
	static int dy[] = {0, -1, 0, 1};
	static int[][] arr = new int[5][5];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 		
		for(int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0, 0);
	}

	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		
		int mx = 0;
		int my = 0;
		
		for(int k = 0; k < 4; k++) {
			mx = j + dx[k];
			my = i + dy[k];
			if(arr[mx][my] == 1 && my >= 0 && mx >= 0 && my < 5 && mx < 5) arr[mx][my] = 2;
		}
	}

}
