import java.util.Scanner;

public class Main {
	
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
		int arrN = sc.nextInt();
		int[] arr = new int[arrN];

		for(int i = 0; i < arrN; i++) arr[i] = sc.nextInt();
		
		sc.close();
		
		for(int i = 0; i < arrN - 1; i++) {
			int gcd = euclid(arr[i], arr[i+1]);
			arr[i+1] = gcd;
		}
		System.out.println(arr[arrN-1]);
	}

}
