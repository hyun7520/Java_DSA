package 역량강화3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int[][] arr = new int[10005][2];
		
		for(int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int km = 0;
		for(int i = 2; i <= N; i++) {
			km += (Math.abs(arr[i-1][0] - arr[i][0])) + (Math.abs(arr[i-1][1] -arr[i][1]));
		}
		int cnt = 999999999;
		for(int i = 2; i < N; i++) {
			int max = km - (((Math.abs(arr[i-1][0] - arr[i][0])) + (Math.abs(arr[i-1][1] -arr[i][1]))) -
					((Math.abs(arr[i][0] - arr[i+1][0])) + (Math.abs(arr[i][1] -arr[i+1][1]))) +
					((Math.abs(arr[i-1][0] - arr[i+1][0])) + (Math.abs(arr[i-1][1] -arr[i+1][1]))));
			if(max < cnt) cnt = max;
		}
		System.out.println(cnt);
		
	}

}