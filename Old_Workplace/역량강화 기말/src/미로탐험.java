import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class πÃ∑Œ≈Ω«Ë {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] dx = {0,0,1,-1};
		int[] dy = {1,-1,0,0};
		Queue<Integer[]> start = new LinkedList<>();
		
		int[][] arr = new int[N+1][M+1];
		boolean[][] visit = new boolean[N+1][M+1];
		
		for(int i = 1; i <= N; i++) {
			String line = bf.readLine();
			for(int j = 1; j <= M; j++) {
				arr[i][j] = line.charAt(j-1) - '0';
			}
		}
		start.add(new Integer[] {1,1});
		visit[1][1] = true;
		
		while(!start.isEmpty()) {
			Integer[] tmp = start.poll();
			int x = tmp[0];
			int y = tmp[1];
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];				
				if(nx < 1 || nx > N || ny < 1 || ny > M) continue;
				if(arr[nx][ny] == 1 && !visit[nx][ny]) {
					start.add(new Integer[] {nx, ny});
					arr[nx][ny] = arr[x][y] + 1;
					visit[nx][ny] = true;
				}

			}
		}
	
		if(!visit[N][M]) System.out.println(-1);
		else {
			System.out.println(arr[N][M]);
		}
	}

}
