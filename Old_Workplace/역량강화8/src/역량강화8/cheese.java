package 역량강화8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cheese {
	
	static int[][] arr;
	static boolean[][] visit;
	static boolean cheese;
	static int N, M, time, cheese_cnt;
	static int dx[] = {1, 0, -1, 0};
	static int dy[] = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		cheese_cnt = 0;
		
		arr = new int[N][M];
		visit = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1) cheese_cnt++;
			}
		}
		time = 0;
		cheese = false;
		
		while(cheese_cnt != 0) {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					if(arr[i][j] == 1 && melt(i, j)) {
						arr[i][j] = 0;
						cheese_cnt--;
					}
				}
				air_check();
			}
		}
	}

	private static void air_check() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 4; i++) {
			
		}
	}

	private static boolean melt(int x, int y) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
				if(arr[nx][ny] == 1 && !visit[nx][ny] && edge(nx, ny)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean edge(int x, int y) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dx[i];
			if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
				if(arr[nx][ny] == 0) cnt++;
			}
		}
		if(cnt == 2) return true;
		else return false;
	}

}
