package 역량강화3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간의합 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int sum = 0;
		
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = i; j < N; j++) {
				int cnt = 0;
				for(int k = i; k <= j; k++) {
					cnt += arr[k];
				}
				if(cnt == M) sum++;
			}
		}
		System.out.println(sum);
		
	}

}
