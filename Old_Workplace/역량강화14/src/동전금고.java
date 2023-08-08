import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 동전금고 {
	
	static int M, N;
	static boolean [][] visit;
	static int[][] arr;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static Queue<Integer[]> que;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		arr = new int[M + 1][N + 1];
		int max = 0;
		
		for(int i = 1; i < M + 1; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j = 1; j < N + 1; j++) {
				int temp = Integer.parseInt(st.nextToken());
				arr[i][j] = temp;
				if(temp > max) max = temp;
			}
		}
		
		int start = 0, end = max;
		
		while(start < end) {
			int mid = (start + end) / 2;
			if(bfs(mid)) end = mid;
			else start = mid + 1;
		}	
		System.out.println(start);
	}

	private static boolean bfs(int mid) {
		// TODO Auto-generated method stub
		que = new LinkedList<>();
		que.offer(new Integer[] {1,1}); 
		visit = new boolean[M + 1][N + 1];
		visit[1][1] = true;
		
		while(!que.isEmpty()) {
			Integer[] temp = que.poll();
			int x = temp[0]; int y = temp[1];
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx < 1 || nx > M || ny < 1 || ny > N) {
					continue;
				}
				if(arr[nx][ny] <= arr[x][y] + mid && visit[nx][ny] == false) {
					visit[nx][ny] = true;
					que.offer(new Integer[] {nx, ny});
				}
			}
		}
		return visit[M][N];
	}	

}
