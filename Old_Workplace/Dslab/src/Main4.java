import java.util.Scanner;
public class Main4 { //배수의 합

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long sum = 0;
				
		for(long i = 0; i <= n; i++) {
			if (i%a == 0 || i%b == 0) {
				sum += i;
			}
		}
			
		System.out.println(sum);
		sc.close();
		
	}
}
