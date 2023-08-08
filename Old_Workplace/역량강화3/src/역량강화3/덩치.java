package 역량강화3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 덩치 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		String[] arr = new String[N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			arr[i] = st.nextToken() + " " + st.nextToken();
		}
		
		for(int i = 0; i < N; i++) {
			int cnt = 1;
			String[] temp = arr[i].split(" ");
			for(int j = 0; j < N; j++) {
				if(i == j) continue;
				String[] temp2 = arr[j].split(" ");
				if(Integer.parseInt(temp[0]) < Integer.parseInt(temp2[0]) && 
						Integer.parseInt(temp[1]) < Integer.parseInt(temp2[1])) {
					cnt++;
				}
			}
			System.out.print(cnt+" ");
		}
	}

}
