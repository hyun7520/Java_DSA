package 역량강화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bubble {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int tmp = 0;
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int[] arr =new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N-1; i++) {
			for(int j = 1; j < N-i; j++) {
				if(arr[j] < arr[j-1]);
				arr[j-1] = tmp;
			}
		}
	}

}
