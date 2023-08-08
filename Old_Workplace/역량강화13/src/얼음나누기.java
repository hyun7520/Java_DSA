import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 얼음나누기 {
	
	static int N, M;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int max = 0, min = 0;
		arr = new int[M];
		
		for(int i = 0; i < M; i ++) {
			arr[i] = Integer.parseInt(bf.readLine());
			if(arr[i] > max) max = arr[i];
		}
		
		while(min < max) {
			int mid = (min + max + 1) / 2;
			
			if(check(mid)) min = mid;
			else max = mid -1;
		}
		System.out.println(min);
	}

	private static boolean check(int mid) {
		// TODO Auto-generated method stub
		if(mid == 0) return true;
		long cnt = 0;
		for(int i = 0; i < M; i++) {
			cnt += (arr[i]/mid);
		}
		if(cnt >= (long)N) {
			return true;
		}
		return false;
	}

}
