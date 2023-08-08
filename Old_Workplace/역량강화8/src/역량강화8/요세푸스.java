package 역량강화8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요세푸스 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Queue<Integer> que = new LinkedList<>();
		
		for(int i = 1; i <= N; i++) {
			que.offer(i);
		}
		while(!que.isEmpty()) {
			for(int i = 0; i < M; i++) {
				if(i == M - 1) {
					sb.append(que.poll() + " ");
				}
				else que.add(que.poll());
			}
		}
		System.out.println(sb);
	}

}
