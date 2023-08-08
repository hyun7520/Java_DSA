package 역량강화10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 불 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			
			Queue<Integer[]> start_willy = new LinkedList<>();
			Queue<Integer[]> start_fire = new LinkedList<>();
			char[][] building = new char[h][w];
			int[][] arr = new int[h][w];
			int[][] run = new int[h][w];
			boolean[][] visit = new boolean[h][w];
			
			for(int j = 0; j < h; j++) {
				String line = bf.readLine();
				for(int k = 0; k < w; k++) {
					char temp = line.charAt(k);
					building[j][k] = temp;
					if(temp == '@') {
						start_willy.add(new Integer[] {j, k});
					}
					if(temp == '*') {
						start_fire.add(new Integer[] {j, k});
						arr[j][k] = 1;
					}
				}
			}
			while(!start_fire.isEmpty()) {
				Integer[] tmp = start_fire.poll();
				int x = tmp[0];
				int y = tmp[1];
				for(int l = 0; l < 4; l++) {
					int nx = x + dx[l];
					int ny = y + dy[l];
					if(nx < 0 || ny < 0 || nx > h-1 || ny > w-1) {
						continue;
					}
					if(building[nx][ny] == '.') {
						building[nx][ny] = '*';
						start_fire.add(new Integer[] {nx, ny});
						arr[nx][ny] = arr[x][y] + 1;
					}
				}
			}
			while(!start_willy.isEmpty()) {
				Integer[] temp = start_willy.poll();
				int a = temp[0];
				int b = temp[1];
				for(int l = 0; l < 4; l++) {
					int na = a + dx[l];
					int nb = b + dy[l];
					if(na < 0 || nb < 0 || na > h-1 || nb > w-1) {
						continue;
					}
					if(building[na][nb] == '*' && !visit[na][nb]) {
						visit[na][nb] = true;
						start_willy.add(new Integer[] {na, nb});
						run[na][nb] = arr[a][b] + 1;
					}
				}
			}
			boolean fail = true;
			int ans = Integer.MIN_VALUE;
			for(int j = 0; j < h; j++) { 
				for(int k = 0; k < w; k++) { 
					if(run[j][0] == 0 && run[j][w-1] == 0 && run[0][k] == 0 && run[h-1][k] == 0) {
						fail = false;
					}
					ans = Math.max(ans, arr[j][k] - 1);
				}
			}		
			if(!fail) System.out.println("IMPOSSIBLE");
			else System.out.println(ans);
		}
	}
}
