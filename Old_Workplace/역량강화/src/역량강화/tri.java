package 역량강화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tri {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int cnt = 0;
		
		for(int i = 1; i < N; i ++) {
			for(int j = 1; j < N; j++) {
				for(int k = 1; k < N; k++) {
					if(k == N - i - j && k < i+j && i <= j && j <= k) cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
