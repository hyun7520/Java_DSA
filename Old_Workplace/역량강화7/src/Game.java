import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Game {
	
	static int[][] board;
	static int[][] visit;
	static int[] ver;
	static boolean diag1;
	static boolean diag2;
	static int[] horiz;
	static int cnt;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		board = new int[6][6];
		visit = new int[6][6];
		diag1 = false;
		diag2 = false;
		horiz = new int[6];
		ver = new int[6];
		
		for(int i = 1; i < 6; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j = 1; j < 6; j++) {
				board[i][j] = Integer.parseInt(st.nextToken()); // 빙고판 초기화
			}
		}
		for(int i = 1; i < 6; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j = 1; j < 6; j++) {
				visit[i][j] = Integer.parseInt(st.nextToken()); // 불려진 값 초기화
			}
		}
		cnt = 0;
		
		dfs(1, 1);
	}

	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
		int temp = 0;
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < 6; j++) {
				if(visit[i][j] == 0) visit[i][j] = 1;
				for(int l = 1; l < 6; l++) {
					for(int k = 1; k < 6; k++) {
						if(visit[l][k] == 1) temp++;
						if(temp == 5) ver[i] = 1;
						temp = 0;
					}
					for(int m = 1; m < 6; m++) {
						if(visit[m][m] == 1) temp++;
						if(temp == 5) diag1 = true;
						temp = 0;
					}			
					if(i == 5) {
						for(int o = 5; o>= 0; o--) {
							for(int m = 1; m < 6; m++) {
								if(visit[o][m] == 1) temp++;
								if(temp == 5) diag2 = true;
								temp = 0;
							}
						}
					}
				}
			}
		}
	}
}
