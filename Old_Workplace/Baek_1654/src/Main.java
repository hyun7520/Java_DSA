import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long min = 0, max = 0;
		
		int[] arr = new int[N];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		
		Arrays.sort(arr);
		max = arr[arr.length - 1];
		
		max = max + 1;
		
		while(min < max) {
			long mid = (min + max) / 2;
			
			long count = 0;
			
			for(int i = 0; i < arr.length; i++) {
				count += (arr[i]/mid);
			}
			if(count < M) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
		}
		
		System.out.println(max - 1);
	}

}
