package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob10872 {
	
	static int k;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		k = 1;
		
		factorial(N);
	}

	private static void factorial(int n) {
		// TODO Auto-generated method stub
		if(n == 0) System.out.println(1);
		else {
			k = k * n;
			if(n - 1 == 0) System.out.println(k);
			else factorial(n-1);
		}
	}

}
