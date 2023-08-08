import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class CountingHaybales {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		ArrayList<Integer> arr= new ArrayList<>();
		
		st = new StringTokenizer(bf.readLine());
		for(int i = 1; i <= N; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(arr);
		
		for(int i = 0; i < Q; i++) {
			st = new StringTokenizer(bf.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int l = 1, r = N;
			while(l < r) {
				int mid = l + (r-l) / 2;
				if(arr.get(mid) < end) {
					l = mid + 1;
				}
				else if(arr.get(mid) > end) {
					r = mid;
				}
				else if(arr.get(mid) == end) {
					r= mid;
				}
			}
			while(l < r) {
				int mid = l + (r-l) / 2;
				if(arr.get(mid) > start) {
					r = mid;
				}
				else if(arr.get(mid) < start) {
					l = mid;
				}
				else if(arr.get(mid) == start) {
					l = mid;
				}
			}
			int cnt = 0;
			
			for(int k = l; k <= r; k++) {
				
			}
			System.out.println(cnt);
		}
	}

}
