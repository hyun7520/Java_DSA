package 역량강화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class blackJack {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];		
		
		StringTokenizer num = new StringTokenizer(bf.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(num.nextToken());
		}
		
		int ans = 0;
		
		for(int i = 0; i < N -2; i++) {
			int cnt = 0;
			if(arr[i] > M) continue;
			for(int j = i+1; j < N - 1; j++) {
				if(arr[j] + arr[i] > M) continue;
				for(int k = j+1; k < N; k++) {
					cnt = arr[i] + arr[j] + arr[k];
					if(cnt <= M && cnt > ans) {
						ans = cnt;
					}
				}
			}
		}
		System.out.println(ans);
	}

}
