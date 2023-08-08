import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 휴게소세우기 {
	
	static int N, M, L;
	static ArrayList<Integer> arr = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(arr);
		
		int start = 1, end = L;
		while(start < end) {
			int mid = (start + end + 1) / 2;
			if(check(mid)) start = mid;
			else end = mid - 1;
		}
		System.out.println(start + 1);
	}

	private static boolean check(int mid) {
		// TODO Auto-generated method stub
		int now = 0, cnt = 0;
		for(int i = 0; i < N; i++) {
			int temp = arr.get(i) - now;
			cnt += (temp - 1) / mid;
			now = arr.get(i);
		}
		cnt += (L - now -1) / mid;
		if(cnt > M) {
			return true;
		}
		return false;
	}

}
