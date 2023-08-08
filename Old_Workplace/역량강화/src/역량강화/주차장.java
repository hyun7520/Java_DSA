package 역량강화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주차장 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int last_out = 0, in = 0, out = 0;
		int pay = 0;
		int[] time = new int[101];
		
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(bf.readLine());
			in = Integer.parseInt(st.nextToken());
			out = Integer.parseInt(st.nextToken());
			if(last_out < out) last_out = out;
			for(int j = in; j < out; j++) {
				time[j]++;
			}
		}
		for(int i = 1; i <= last_out; i++) {
			if(time[i] == 1) {
				pay += A;
			}
			if(time[i] == 2) {
				pay += B;
			}
			if(time[i] == 3) {
				pay += C;
			}
		}
		System.out.println(pay);

	}

}
