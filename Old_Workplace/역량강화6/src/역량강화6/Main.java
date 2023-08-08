package 역량강화6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static ArrayList<Integer> ans;
	static int[] arr;
	static boolean[] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		ans = new ArrayList<Integer>();
		arr = new int[N + 1];
		visit = new boolean[N + 1];
		ans.add(0, 1);

		dfs(1);
		
		for(int i = 1; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
			if(i % M == 0) {
				System.out.println();
			}
		}	
	}

	public static void dfs(int x) { 
		if (x == M + 1) {
			for (int i = 1; i <= M; i++) {
				ans.add(0 + i, arr[i]);
			}
			return;
		}
		for (int i = 1; i <= N; i++) {
			if (!visit[i]) {
				arr[x] = i;
				visit[i] = true;
				dfs(x + 1);
				arr[x] = 0;
				visit[i] = false;
			}
		}
	}
}