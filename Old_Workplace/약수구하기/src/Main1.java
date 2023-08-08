import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("두 수의 최대공약수(GCD)");
		Scanner sc = new Scanner(System.in);
		
			int N = sc.nextInt();
			int M = sc.nextInt();
			sc.close();
		
			int gcd = 1;
			for(int i=2; i<=M; i++) {
				while(N%i==0 && M%i==0) {
					gcd*=i;
					N = N/i;
					M = M/i;
				}
			}
			System.out.println(gcd);

	}

}
