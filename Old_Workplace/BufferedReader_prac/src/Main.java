import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
		for(int i = 1; i <= 3; i++) {
			cnt1++;
			System.out.println("a_change");
			for(int j=1; j <= 3; j++) {
				cnt2++;
				System.out.println("b_change");
				for(int k = 1; k <= 3; k++) {
					cnt3++;
					System.out.println("c_change");
				}
			}
		}
		System.out.println("cnt1="+cnt1+", "+"cnt2="+cnt2+", "+"cnt3="+cnt3);
		
		for(int i=1; i < 5; i++) {
			for(int j=1; j < 5; j++) {
				for(int k=1; k < 5; k++) {
					System.out.println("a="+i+", "+"b="+j+", "+"c="+k);
				}
			}
		}
	}
}