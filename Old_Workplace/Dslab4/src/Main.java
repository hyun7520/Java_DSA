import java.util.Scanner;
public class Main {
	/*
	static long sum(int n) {
		long sum = 0;           //위의 sum과 아래의 sum 다르게 인식, 한번만 실행
		for(int i = 1; i <= n; i++) {
			sum += i;   //n번 실행 고로 O(N) 알고리즘이라고 할 수 있다. 
		}
		return sum;  //한번만 실행
		//1 + n + 1 이지만 점근적 시점에서 볼때 한번씩 실행되는 것은 무시할수 있다. 
	}
	*/
	// advanced algorithm for summing from 1 to n.
	static long advSum(int n){
		//long n1 =(long) n;  형변환을 해주거나 다음 라인처럼 n을 형변환해준다. 결과값이 int에 담기지 않는다.
		long sum = (long)n * (n+1) / 2; //O1 알고리즘이다 n의 수에 구애 X,
		//더하기 한번 나누기 한번 곱하기 한번 +한번으로 연산의 수가 제한되어 있음.		
		return sum;  
		//주석 처리 알고리즘보다 개선됨 알고리즘이다. 5억 넣을시 기존 160ms에서 0ms 로 줄어듬
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long timeStamp = System.currentTimeMillis();
		long result = advSum(n);
		long elapsedTime = System.currentTimeMillis() - timeStamp;
		System.out.println("sum form 1 to " +n+ " is " +result);
		System.out.println("Elapsed time is " +elapsedTime+"ms");
		/*
		int n = scan.nextInt();
		long timeStamp = System.currentTimeMillis();
		long result = sum(n);
		System.out.println("n = "+ n);
		long elapsedTime = System.currentTimeMillis() - timeStamp;
		System.out.println("sum form 1 to " +n+ " is " +result);
		System.out.println("Elapsed time is " +elapsedTime+"ms");
		*/

	}

}
