package 역량강화4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Cycle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int temp = N;
		int cnt = 0;
		boolean check = false;
		ArrayList<Integer> arr = new ArrayList<>();
		
		
		while(!check) {
			temp = (temp*N)%P;
			
			for(int i = 0; i < cnt; i ++) {
				if(arr.get(i) == temp) {
					check = true;
					break;
				}
			}
			arr.add(temp);
			cnt++;
		}
		for(int i = 0; i < arr.size(); i++) {
			if(arr.contains(arr.get(i))) arr.remove(arr.get(i));
			break;
		}
		System.out.println(arr.size());
	}
}
