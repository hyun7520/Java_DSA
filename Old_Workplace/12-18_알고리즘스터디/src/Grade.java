import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Grade {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String[][] arr = new String[N][2];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		for(int i = 1; i < N; i++) {
			if( Integer.parseInt(arr[i-1][1]) > Integer.parseInt(arr[i][1]) ) {
				String temp = arr[i-1][0];
				arr[i-1][0] = (arr[i][0]);
				arr[i][0] = (temp);
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.print(arr[i][0]+" ");
		}
		
	}

}
