package 역량강화시험;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 사과먹기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		int R = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		int temp;
		if(R > G) temp = R;
		else temp = G;
		
		for(int i = 1; i <= temp; i++) {
			if(R % i == 0 && G % i == 0) {
				arr.add(i);
			}
		}
		
		for(int i = 0; i < arr.size(); i++) {
			int divide = arr.get(i);
			System.out.print(divide + " " + R / divide + " " + G / divide);
			System.out.println();
		}
	}
}
