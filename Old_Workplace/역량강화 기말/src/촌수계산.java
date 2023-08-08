import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ÃÌ¼ö°è»ê {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		int[][] arr = new int[N+1][N+1];
		boolean[] visit = new boolean[N+1];
		int[] chon = new int[N+1];
		Queue<Integer> que = new LinkedList<>();
 		
		st = new StringTokenizer(bf.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());		
		int m = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x][y] = arr[y][x] = 1;
		}
		
		que.add(start);
		visit[start] = true;
		
		while(!que.isEmpty()) {
			int now = que.poll();
			if(start == end) break; 
			else {
				for(int i = 0; i < arr.length; i++) {
					if(arr[now][i] == 1 && visit[i] == false) {
						que.add(i);
						visit[i] = true;
						chon[i] = chon[start] + 1;
					}
				}
			}
		}
		
		if(chon[end] == 0) System.out.println(-1);
		else System.out.println(chon[end]);
	}

}
