import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ƒ…¿Ã∫Ì {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long[] arr = new long[N];
		long max = 0;
		
		for(int i = 0; i < N; i++) {
			long temp = Integer.parseInt(bf.readLine());
			arr[i] = temp;
			if(max < temp) max = temp;
		}
		max = max + 1;
		long start = 0;
		long mid = 0;
		
		while(start < max) {
			mid = (start + max) / 2;
			long cnt = 0;
			for(int i = 0; i < arr.length; i++) {
				cnt += arr[i] / mid;
			}
			if(cnt < M) max = mid;
			else start = mid + 1;
		}
		System.out.println(start - 1);
	}
}
