import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int sqrt = (int)Math.sqrt(M);
		
		Boolean[] arr = new Boolean[M+1];
		arr[0] = arr[1] = true;
		for(int i = 2; i < arr.length; i++) {
			arr[i] = true;
		}
		
		for(int i = N; i <= sqrt; i++) {
			if(N%i == 0) {
				arr[i] = false;
				break;
			}
		}
		for(int i = N; i <= M; i++) {
			if(!arr[i]) System.out.println(i);
		}
	}

}
