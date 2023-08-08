import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		char xtemp = st.nextToken().charAt(0);
		int x = (int)xtemp - 97;
		int y = Integer.parseInt(st.nextToken());
		int count = 0;
		int[] xarr = new int[8];
		int[] yarr = new int[8];
	
		if(x+2<8 && y+1<8) {
			count++;
		}
		if(x+2<8 && y-1<8) {
			count++;
		}
		if(x+1<8 && y+2<8) {
			count++;
		}
		if(x+1<8 && y-2<8) {
			count++;
		}
		if(x-1>0 && y-2>0) {
			count++;
		}
		if(x-1>0 && y+2>0) {
			count++;
		}
		if(x-2>0 && y-1>0) {
			count++;
		}
		if(x-2>0 && y+1>0) {
			count++;
		}
		System.out.println(count);
	}

}
