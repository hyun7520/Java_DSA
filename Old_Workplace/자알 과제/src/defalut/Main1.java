package defalut;
import java.util.Scanner;

public class Main1 {
	static void hanoi(int n, char a, char b, char c) {
		if(n==1) {
			System.out.println("Move disk 1 from rod "+a+" to rod "+b);
			return;
		}
		hanoi(n-1, a, c, b);
		System.out.println("move disk "+n+" from "+a+"->"+b);
		hanoi(n-1, c, b, a);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		hanoi(n, 'a', 'b', 'c');
		
		sc.close();
	}

}
