package 역량강화5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 키순서 {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		ArrayList<ArrayList<Integer>> fw = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> bk = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i <= N; i++) {
			fw.add(new ArrayList<Integer>());
			bk.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			fw.get(a).add(b);
			bk.get(b).add(a);
		}
		
		int cnt = 0;
		for(int i = 1; i <= N; i++) {
			
		}
		
	}

}
