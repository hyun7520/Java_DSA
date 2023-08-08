import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ¾îºÎ¹Ù {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int visit[][] = new int[N + 1][3];
		int[] arr = new int[] {1, 2, N};
		ArrayList<ArrayList<Integer>> roads = new ArrayList<>();
		
		for(int i = 0; i < M + 1; i ++) {
			roads.add(new ArrayList<>());
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			roads.get(a).add(b);
			roads.get(b).add(a);
		}
		
		for(int i = 0; i < 3; i++) {
			Queue<Integer> point = new LinkedList<>();
			int start = arr[i];
			visit[start][i] = 1;
			point.offer(start);
			while(!point.isEmpty()) {
				int temp = point.poll();
				for(int j : roads.get(temp)) {
					if(visit[j][i] == 0) {
						visit[j][i] = visit[temp][i] + 1;
						point.offer(j);
					}
				}
			}
		}
		long dist = Long.MAX_VALUE;
		for(int i = 0; i <= N; i++) {
			if(visit[i][0] == 0 || visit[i][1] == 0 || visit[i][2] == 0) {
				continue;
			}
			long tmp = (long)A*(visit[i][0]-1) + B * (visit[i][1] - 1) + P * (visit[i][2] - 1);
			if(dist > tmp) dist = tmp;
		}
		System.out.println(dist);
	}

}
