import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS {
	
	static int[][] connect;
	static boolean[] visit;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		connect = new int[N+1][N+1];
		visit = new boolean[N+1];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			connect[a][b] = connect[b][a] = 1;
		}
		dfs(V);
		System.out.println();
		
		for(int i = 0; i < visit.length; i++) {
			visit[i] = false;
		}
		bfs(V);
	}

	private static void dfs(int v) {
		// TODO Auto-generated method stub
		visit[v] = true;
		System.out.print(v + " ");
		
		if(v == connect.length) return;
		for(int i = 1; i < connect.length; i++) {
			if(connect[v][i] == 1 && visit[i] == false) {
				dfs(i);
			}
		}
	}

	private static void bfs(int v) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(v);
		visit[v] = true;
		System.out.print(v + " ");
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			for(int i = 1; i < connect.length; i++) {
				if(connect[temp][i] == 1 && visit[i] == false) {
					queue.offer(i);
					visit[i] = true;
					System.out.print(i + " ");
				}
			}
		}
	}
}
