import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나무자르기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		int min = 0, max = 0;
		
		st = new StringTokenizer(bf.readLine());
		
	
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(max < arr[i]) max = arr[i];
		}
		
		while(min < max) {
			int mid = (min + max) / 2;
			long cnt = 0;
			for(int i = 0; i < N; i++) {
				if(arr[i] - mid > 0) {
					cnt += (arr[i] - mid);
				}
			}
			if(cnt < M) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
			
		}
		System.out.println(min - 1);
	}

}
