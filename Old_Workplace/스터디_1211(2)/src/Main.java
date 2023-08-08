import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int cnt = 0;
		String time = "";
		
		for(int i = 0; i <= N; i++) {
			for(int j = 0; i < 60; j++) {
				for(int k = 0; k < 60; k++) {
					time += i;
					time += j;
					time += k;
					if(time.contains("3")) cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
