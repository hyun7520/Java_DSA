import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ≈∏¿œ∏µ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int[] tile = new int[N+1];
	
		for(int i = 1; i <= N; i ++) {
			if(i == 1) tile[i] = 1;
			else if(i == 2) tile[i] = 2;
			else tile[i] = (tile[i-2] + tile[i-1]) % 10007;
		}
		
		System.out.println(tile[N]);
	
	}

}
