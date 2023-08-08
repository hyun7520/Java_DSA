package 역량강화3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 표지 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		String label = bf.readLine();
		String[] arr = new String[N];

		for(int i = 0; i < N; i++) {
			arr[i] = bf.readLine();
		}
	
		int cnt = 0;
		
		for(int i = 0 ; i < N; i++) {
			boolean pos = false;
			for(int j = 0; j < arr[i].length(); j++) {
				for(int k = 1; k < arr[i].length(); k++) {
					if(j+ (label.length() - 1)*k >= arr[i].length()) {
						continue;
					}
					boolean same = true;
					for(int m = 0; m < label.length(); m++) {
						if(label.charAt(m) != arr[i].charAt(j + m * k)) same = false;
					}
					if(same == true) pos = true;
				}	
			}
			if(pos == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		// 같은 간격이라는 조건이 있다.
	}

}