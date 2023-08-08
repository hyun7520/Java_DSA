import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lowerbound {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				
		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int[N+1];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int k = Integer.parseInt(bf.readLine());
		int start = 1;
		int end = N;
		
		
		while(start < end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] < k) {
				start = mid + 1;
			}
			else if(arr[mid] > k) {
				end = mid;
			}
			else if(arr[mid] == k) {
				end = mid;
			}
		}
		if(arr[start] < k) System.out.println(N+1);
		
		else System.out.println(start);
	}
}
