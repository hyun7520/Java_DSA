import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IceCream {
	
	int count = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer temp = new StringTokenizer(bf.readLine());
			for(int j = 0; j < N; j++ ) {
				arr[i][j] = Integer.parseInt(temp.nextToken());
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++ ) {
				if(arr[i][j] == 1) {
					
			}
		}
	}
	}
}
