import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int o = sc.nextInt();
		int gcd = 1;
		
		for(int i=2; i<o; i++) {
			while(n%i==0 && m%i==0 && o%i==0) {
				gcd*=i;
				n = n/i;
				m = m/i;
				o = o/i;
			}
		}
		System.out.println(gcd);
	}

}
