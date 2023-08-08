package 역량강화시험;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 색칠2 {
	
	static ArrayList<ArrayList<Integer>> points;
	static int[] visit;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int M = Integer.parseInt(bf.readLine());
		points = new ArrayList<>();
		visit = new int[N];
		
		for(int i = 0 ; i < N; i++) {
			points.add(new ArrayList<>());
		}
		
		for(int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			points.get(a).add(b);
			points.get(b).add(a);
		}
	}

}
