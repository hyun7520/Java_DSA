import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = new String[]; 
		
		while(true) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String num = st.nextToken();
			
			if(num.equals("0")) break;
			else arr.add(num);
		}
		
	}

}
