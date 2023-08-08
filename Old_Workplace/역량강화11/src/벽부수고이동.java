import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 벽부수고이동 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int[] dx = {0,0,1,-1};
		int[] dy = {1,-1,0,0};
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Queue<Integer[]> que = new LinkedList<>();
		
		int[][] arr= new int[N+1][M+1];
		int[][][] visit = new int[N+1][M+1][2];
		
		for(int i = 1; i <= N; i++) {
			String line = bf.readLine();
			for(int j = 0; j < M; j++) {
				int temp = line.charAt(j) - '0';
				arr[i][j+1] = temp;
				visit[i][j+1][0] = 0;
				visit[i][j+1][1] = 0;
			}
		}
		que.add(new Integer[] {1, 1, 0});
		
		while(!que.isEmpty()) {
			Integer[] temp = que.poll();
			int x = temp[0];
			int y = temp[1];
			int crash = temp[2];
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx < 1 || nx > N || ny < 1 || ny > M) continue;
				if(arr[nx][ny] == 0) { // 뚫린 길일 경우
					if(visit[nx][ny][0] == 0) { 
						visit[nx][ny][0] = visit[x][y][0] + 1;
						visit[nx][ny][1] = visit[x][y][1] + 1;
						que.add(new Integer[] {nx, ny, 0});
					}
				}
				if(arr[nx][ny] == 1) { // 막힌 길일 경우
					if(crash == 1) continue; // 한번 뚤은 경우
					if(crash == 0) { // 아직 한 번도 부수지 않은 경우
						if(visit[nx][ny][0] == 0) {
							visit[nx][ny][0] = visit[x][y][0] + 1;
							visit[nx][ny][1] = visit[x][y][1] + 1;
							que.add(new Integer[] {nx, ny, 1});
						}
					}
				}
			}
		}
		int ans1 = Integer.MIN_VALUE;
		int ans2 = Integer.MIN_VALUE;
		boolean fail = true;
		
		for(int i = 1; i <= N; i++) {
			if(visit[N][M][0] == 0 && visit[N][M][1] == 0) {
				fail = false;
				break;
			}
			for(int j = 0; j <= M; j++) {
				ans1 = Math.max(ans1, visit[i][j][0]);
				ans2 = Math.max(ans2, visit[i][j][1]);
				
			}
		}
		if(!fail) System.out.println(-1);
		else {
			System.out.println(ans1 + " "+ ans2);
			int ans = Math.min(ans1, ans2);
			System.out.println(ans);
		}
	}

}
