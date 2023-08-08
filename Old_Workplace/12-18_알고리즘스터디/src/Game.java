import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Game {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int count = 0;
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][M];
		
		StringTokenizer AB = new StringTokenizer(bf.readLine());
		int A = Integer.parseInt(AB.nextToken());
		int B = Integer.parseInt(AB.nextToken());
		int direc = Integer.parseInt(AB.nextToken());
		
		for(int i = 0; i < N; i++) {
			StringTokenizer temp = new StringTokenizer(bf.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(temp.nextToken());
			}
		}
		while(true) {
			if(arr[A+1][B] == 0 || arr[A-1][B] == 0 || arr[A][B+1] == 0 || arr[A][B-1] == 0) {
				count++;
			}
			else System.out.println(count);
		}
	}

}
