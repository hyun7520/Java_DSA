import java.util.Scanner;
public class Main {
	// return true if p is prime 
	static boolean isPrime(int p) {
		//if the number of divisors is 2, prime. 약수의 개수가 2라면 소수
		int dcount = 0; //약수 카운트
		for(int i = 1; i <= p; i++) {
			if( p%i == 0 ) dcount++;   //이것을 기준으로 삼는다. P번 실행
		}
		return dcount == 2;            //약수 개수가 2라면 True 리턴
		//if(dcount == 2) 자체로도 boolean, decount가 2이면 True를 리턴
	}
	static boolean isPrime1(int p) {
		if(p == 1) return false;       // if p is 1, return false.
		for(int i = 2; i < p; i++) { 
			if(p%i == 0) return false; // if p is divided by 2 ~ p-1, p is not a prime pumber
		}
		return true;
	}
	static boolean isPrime2(int p) {
		if(p == 1) return false; //if p is 1, return false
		// if p is divided by 2 ~ sqrt(p), p is not a prime number.
		for(int i = 2; i*i <= p; i++) {
			if(p%i == 0) return false; //n번 호출해 루트n번 실행하기에 O(n루트n) 알고리즘이 된다.
		}
		return true;
	}
	// return the number of primes less than equal to n.
	static int pi(int n) {
		int pcount = 0;
		for(int i = 1; i <= n; i++) {
			if( isPrime2(i) ) pcount++; //이것을 기준으로 i가 n번 실행 n이 1일때 p는 1번, n이 2일때 p는 2번 실행 계속되면 
			// 1+2+3+4 .... i가 n이면 p번 실행 n*(n+1)/2 = N**2/2 + n/2 이기에 O(n**2)알고리즘이라고 할수 있다.
			//고로 isPrime 은 O(n**2)알고리즘이다.
			
		}
		return pcount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long timeStamp = System.currentTimeMillis(); // 현시간 측정
		int pcount = pi(n);
		long elapsed = System.currentTimeMillis() - timeStamp;//이저시간 빼기 현시간으로 걸린시간 측정
		System.out.println("pi("+n+")="+pcount);
		System.out.println("Elapsed time is "+elapsed+" ms");
	}

}
