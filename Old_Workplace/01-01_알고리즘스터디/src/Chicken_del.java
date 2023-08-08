import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chicken_del {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken()) + 1;
		int M = Integer.parseInt(st.nextToken()) + 1;
		int[][] town = new int[N][N];
		
		for(int i = 1; i < N; i ++) {
			StringTokenizer sr = new StringTokenizer(bf.readLine());
			for(int j = 1; j < N; j++) {
				town[i][j] = Integer.parseInt(sr.nextToken());
			}
		}
	}

}
