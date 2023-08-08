package 역량강화시험;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class 이분 {

	static int[] color;
	static ArrayList<ArrayList<Integer>> points;
	static boolean check;
	static int black = 1;
	static int white = 2;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		int V = Integer.parseInt(bf.readLine());
		int E = Integer.parseInt(bf.readLine());
		color = new int[V + 1];
		points = new ArrayList<>();
		check = true;
		
		for(int i = 0; i <= V; i++) {
			points.add(new ArrayList<>());
		}
		
		for(int i = 0; i < E; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			points.get(a).add(b);
			points.get(b).add(a);
		}
		
		for(int i = 1; i <= V; i++) {
			if(color[i] == 0) {
				if(dfs(i, black)) break;
			}
		}
		if(check) {
			System.out.println("OK");
		} else System.out.println("IMPOSSIBLE");
	}
	
	public static boolean dfs(int i, int f_color) {
		color[i] = f_color;
		
		for(Integer j : points.get(i)) {
			if(color[j] == f_color) {
				check = false;
				return true;
			}
			if(color[j] == 0) {
				if(dfs(j, 3 - f_color)) return true;
			}
		}
		return false;
	}
}