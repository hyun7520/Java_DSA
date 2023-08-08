import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("베르트랑 공준 >");
		
		int n = sc.nextInt();
		
		// step 1) 배열 및 초기값 세팅
		
		boolean[] arr= new boolean[2*n]; // 2n 크기의 boolean 타입 배열 생성
		
		for(int i = 2; i < 2*n; i++) arr[i] = true;
		
		int sqrt2N = (int)Math.sqrt(2*n); //int이기에 (int)를 넣어주어야 한다. double이면 그냥 가능
		
		// step 2) 체 알고리즘 만들기
		
		for(int i=2; i<=sqrt2N; i++) { //i*i<=2n
			if(arr[i]) {
				for(int j=i*i; j<2*n; j+=i) {
					arr[j] = false;
				}
			}
		}
		
		// step 3) 베르트랑 공준 적용
		
		// n< p <2n 소수의 개수 구하기
		int count = 0;
		for(int i = n+1; i<2*n; i++) {
			if(arr[i])
				count++;
		}

	
		System.out.println(count);
	}
}
