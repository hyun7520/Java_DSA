import java.util.Scanner;
public class Main_official {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("셋 이상 정수의 최대 공약수");
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i= 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ans = gcd(arr[0], arr[1]);
		
		for(int i = 2; i < N; i++) {
			ans = gcd(ans, arr[i]);
		}
		System.out.println(ans);
	}
	static int gcd(int a, int b) {
		while(a%b!=0) {
			a=a%b;
			int temp = a;
			a= b;
			b= temp;
		}
		return b;
		
	}


}
