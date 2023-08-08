import java.util.Scanner;
public class Main {
	static void hanoi(int n, char a, char b, char c) {
		// Initial condition
		// - if n is 1, just move a disk form a to b	
		if(n == 1) {
			System.out.println(a + "->" + b);
			return; //탈출조건
			//리턴이 없을 경우 else를 작성해야 한다. 길어짐, 효율은 같음
		}
		// Inductive condition
		// -move n-1 disks for a to c
		// -move a disk from a to b
		// -move n-1 disks from c to b
		hanoi(n-1, a, c, b);
		hanoi(1, a, b, c);
		hanoi(n-1, c, b, a);
	}
	static int fib(int n) {
		// Initial condition
		// -fib(1) = fib(2) = 1
		if(n==1 || n==2) return 1;
		// Inductive condition
		// -fib(n) = fib(n-1) + fib(n-2)
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//hanoi(n, 'a', 'b', 'c');
		System.out.println(fib(n));
	}

}
