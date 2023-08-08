package 역량강화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cola {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		int max3 = N/3;
		int max5 = N/5;
		int box = -1;
		
		for(int i = 0; i <= max5; i++) {
			for(int j = 0; j <= max3; j++) {
				if(((i*5)+(j*3)) == N) {
					box = i+j;
					break;
				}
			}
		}
		System.out.println(box);
	}

}
