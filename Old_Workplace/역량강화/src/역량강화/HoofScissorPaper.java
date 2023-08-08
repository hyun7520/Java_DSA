package 역량강화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HoofScissorPaper {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		String[] arr = new String[N];
		String[] bes = {"H", "P", "S"};
		
		for(int i = 0; i < N; i++) {
			arr[i] = (bf.readLine());
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				if(arr[i].equals(bes[j]));
			}
		}
	}

}
