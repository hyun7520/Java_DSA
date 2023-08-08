package 역량강화시험;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nqueen일까 {
	
	static int N;
	static char[][] arr;
	static int[] hor, diag1, diag2, ver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(bf.readLine());
		arr = new char[N][N];
		hor = new int[N];
		ver = new int[N];
		diag1 = new int[2 * N + 1];
		diag2 = new int[2 * N + 1];
		
		for(int i = 0; i < N; i++) {
			String line = bf.readLine();
			for(int j = 0; j < N; j++) {
				arr[i][j] = line.charAt(j);
			}
		}
		
		boolean possible = true;
		
		for(int k = 0; k < N; k++) {
			for(int l = 0; l < N; l++) {
				if(arr[k][l] == 'Q') {
					hor[k]++;
					ver[l]++;
					diag1[k + l]++;
					diag2[k - l + N]++;		
				}
				if(hor[k] >=2 || ver[l] >=2 || diag1[k + l] >=2 || diag2[l - k + N] >= 2) {
					possible = false;
					break;
				}
			}
			if(!possible) break;
		}
		if(possible) {
			System.out.print("YES");
		} else {
			System.out.println("NO");
		}
	}
}
