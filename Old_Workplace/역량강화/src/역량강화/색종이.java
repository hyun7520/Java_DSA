package 역량강화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이 {
	
	static int X;
	static int Y;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		int NX = X + 10;
		int NY = Y + 10;
		
		if( X < 0 || X > 90 || Y > 90 || Y < 0) {
			System.out.println(-1);
		}
		else {System.out.println("LH " + X + " " + NY);
			System.out.println("LL " + X + " " + Y);
			System.out.println("RH " + NX + " " + NY);
			System.out.println("RL " + NX + " " + Y);
		}
	}

}
