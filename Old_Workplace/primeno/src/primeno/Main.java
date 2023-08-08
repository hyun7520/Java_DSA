package primeno;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {  // Entry Point 시작점
		// TODO Auto-generated method stub
		System.out.println("소수 판별법");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("> ");
		int N = sc.nextInt();
		int sqrtN = (int)Math.sqrt(N);
		
		boolean[] arr = new boolean[200];
		for(int i =2; i <= N; i++)
			arr[i] = true;
		
		for(int i = 2; i <= sqrtN; i++) {
			if(arr[i]) {
				// 해당 배수를 소수에서 제외
				for(int j = i*i; j<=N; j += i) {
					arr[j] = false;
				}
			}
		}
		
		for(int i = 2; i < N; i++) {
			if(arr[i])
				System.out.print(i+" ");
		}
		
		//
		boolean prime= true;
		for(int i = 2; i <= sqrtN; i++) {
			if(N % i == 0) {
				prime = false;
				break;
			}
		}
		if(prime) 
			System.out.println(N + "은(는) 소수입니다.");
		else
			System.out.println(N + "은(는) 소수가 아닙니다.");
		sc.close();
	}

}
