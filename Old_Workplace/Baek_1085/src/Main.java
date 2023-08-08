import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int xmin, ymin, min = 0;
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		if(x > w-x) {
			xmin = w-x;
		}
		else xmin = x;
		
		if(y > h-y) {
			ymin = h-y;
		}
		else ymin = y;
		
		if(xmin > ymin) min = ymin;
		else min = xmin;
		
		System.out.print(min);
	}

}
