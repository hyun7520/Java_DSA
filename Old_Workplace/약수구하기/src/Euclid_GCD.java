import java.util.Scanner;

public class Euclid_GCD {
	
	public static int euclid(int n, int m) {
		int gcd = n % m;
		if(gcd == 0) {
			return m;
		}
		else return euclid(m, gcd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int o = sc.nextInt();
		
		int GCD = euclid(n, m);
		System.out.println(GCD);

	}

}
