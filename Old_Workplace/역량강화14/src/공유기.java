import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class °øÀ¯±â {
	
	static ArrayList<Integer> arr;
	static int C;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(bf.readLine()));
		}
		
		Collections.sort(arr);
		
		int start = 1, end = arr.get(N-1) - arr.get(0) + 1;
		
		while(start < end) {
			int mid = (start + end + 1) / 2;
			if(check(mid)) start = mid;
			else end = mid - 1;
		}
		System.out.println(start);
	}

	private static boolean check(int mid) {
		// TODO Auto-generated method stub
		int now = arr.get(0);
		int cnt = 1;
		for(int i = 1; i < arr.size(); i++) {
			if(arr.get(i) >= now + mid) {
				now = arr.get(i);
				cnt++;
			}
		}
		if(cnt >= C) return true;
		else return false;
	}

}
