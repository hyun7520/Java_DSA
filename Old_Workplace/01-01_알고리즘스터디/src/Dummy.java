import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dummy {
	
	static int[][] board;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		board = new int[N][N];
		
		int K = Integer.parseInt(bf.readLine());
		for(int i = 0; i < K; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int row = Integer.parseInt(st.nextToken());
			int col = Integer.parseInt(st.nextToken());
			board[row][col] = 1;
		}
		
		int L = Integer.parseInt(bf.readLine());
		for(int i = 0; i < L; i++) {
			StringTokenizer sr = new StringTokenizer(bf.readLine());
			int X = Integer.parseInt(sr.nextToken());
			String C = sr.nextToken();
		}
		
		int count = 0;
		
		while(true) {
			count++;
			
		}
		
	}

}
