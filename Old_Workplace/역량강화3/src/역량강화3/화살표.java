package 역량강화3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 화살표 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		int arr[][] = new int[N][2];
		int length = 0;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			int mindist = Integer.MAX_VALUE;
			for(int j = 0; j < N; j++) {
				if(i == j) continue;
				if(arr[i][1] == arr[j][1]) {
					int dist = Math.abs(arr[i][0] - arr[j][0]);
					mindist = Math.min(dist, mindist);
				}
			}
			length += mindist;
		}
		System.out.println(length);
		
	}

}
