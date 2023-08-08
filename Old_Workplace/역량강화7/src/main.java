import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
	
	static char[][] arr;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new char[N][M];
		
		for(int i = 0; i < N; i++) {
			String temp = bf.readLine();
			for(int j = 0; j < M; j++) {
				
				arr[i][j] = temp.charAt(j);
			}
		}
		
		while(true) {
			boolean gravity = false;
			for(int i = 0; i < N-1; i++) {
				for(int j = 0; j < M; j++) {
					if(arr[i][j] != 'o') continue;
					if(arr[i+1][j] != '.') continue;
					gravity = true;
					arr[i][j] = '.';
					arr[i+1][j] = 'o';
				}
			}
			if(!gravity) break;
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
