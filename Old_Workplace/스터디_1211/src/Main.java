import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int x = 1, y = 1;
		
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		String[] plan = new String[100];
 		
		for(int i = 0; i < plan.length; i++) {
			plan[i] = st.nextToken();
		}
		
		for(int i = 0; i < N; i++) {
			if(plan[i].equals("R")) {
				if(y+1 > N) y = y;
				else y++;
			}
			if(plan[i].equals("L")) {
				if(y-1 < 1) y = y;
				else y--;
			}
			if(plan[i].equals("U")) {
				if(x-1 < 1) x = x;
				else x--;
			}
			else if(plan[i].equals("D")) {
				if(x+1 > N) x = x;
				else x++;
			}
		}
		System.out.print(x+" "+ y);
	}

}
