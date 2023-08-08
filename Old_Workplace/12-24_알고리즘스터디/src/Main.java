import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String point = bf.readLine();
			int temp = point.length()/2;
			int PF=0, PS=0;
			
			String first = point.substring(0, temp);
			String[] arrf = first.split("");
			String second = point.substring(temp, point.length()-1);
			String[] arrs = second.split("");
			
			for(int i = 0; i < temp; i++) {
				PF += Integer.parseInt(arrf[i]);
			}
			for(int i = temp; i < point.length(); i++) {
				PS += Integer.parseInt(arrs[i]);
			}
			
			if(PF == PS) {
				System.out.println("LUCKY");
				
			}
			else System.out.println("READY");
		}
	}

}
