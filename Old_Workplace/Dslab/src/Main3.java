import java.util.Scanner;
public class Main3 { //배수의 합

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long i = 0;
		long sum1 = 0;
		long sum2 = 0;
				
		for(i = 0; i <= n; i++) {
			if(i%a == 0) {
				sum1 += i;
			}
			if(i%b == 0) {
				sum2 += i;
				if(i%a == 0) {
					sum2 -= i;
					
				}
			}
			
		}
		System.out.println(sum1 + sum2);
	}
}
