package 역량강화4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class District {
	
	public static int[][] arr;
	public static int[] dist;
	public static int dx[] = {0, 0, 1, -1};
	public static int dy[] = {1, -1, 0, 0};
	public static boolean visit[][];
	public static int N;
	public static int dist_cnt;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		dist_cnt = 0;
		N = Integer.parseInt(bf.readLine());
		arr = new int[N][N];
		visit = new boolean[N][N];
		dist = new int[N*N];
		
		for(int i = 0; i< N; i++) {
			String line = bf.readLine();
			for(int j = 0; j< N; j++) {
				arr[i][j] = line.charAt(j) - '0';
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j< N; j++) {
				if(arr[i][j] == 1 && visit[i][j] == false) {
					dist_cnt++;
					dfs(i, j);
					
				}
			}
		}
		System.out.println(dist_cnt);
		Arrays.sort(dist);
		for(int i = 0; i < dist.length; i++) {
			if(dist[i] == 0) continue;
			else System.out.println(dist[i]);
		}
	}

	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
		visit[x][y] = true;		
		dist[dist_cnt]++;
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if(!visit[nx][ny] && arr[nx][ny] == 1) {
					dfs(nx, ny);
				}
			}
		}
	}
}
