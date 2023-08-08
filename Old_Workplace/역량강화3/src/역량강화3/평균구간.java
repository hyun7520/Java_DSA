package 역량강화3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class 평균구간 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int[N]; 
		int sum = 0, cnt = 0;
		
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = i; j < N; j++) {
				for(int k = i; k < j; k++) {
					sum += arr[k];
				}
				if(sum % (j - i + 1) != 0) {
					continue;
				}
				int mean = sum / (j - i + 1);
				boolean chk = false;
				for(int k = i; k < j; j++) {
					if(mean == arr[k]) {
						chk = true;
						break;
					}
				}
				if(chk == true) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}