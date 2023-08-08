import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class �����ǻ�� {
	
	static char[][] arr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		char[][] grid = new char[r][c];
		for(int i = 0; i < r; i++) {
			String s = scan.next();
			for(int j = 0; j < c; j++) {
				grid[i][j] = s.charAt(j);
			}
		}
		while(true) {
			boolean moved = false;
			for(int i = 0; i < r-1; i++) {
				for(int j = 0; j < c; j++) {
					if(grid[i][j] != 'o') continue;
					if(grid[i+1][j] != '.') continue;
					moved = true;
					grid[i][j] = '.';
					grid[i+1][j] = 'o';
				}
			}
			if(!moved) break;
		}
		for(char[] out: grid) {
			System.out.println(new String(out));
		}
		scan.close();
	}
}
