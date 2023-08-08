import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		System.out.println("> ");
		Scanner sc = new Scanner(System.in);
		
		a = sc.next();
		
		sc.close();
		System.out.println( a );
		
		boolean b = true;
		
		System.out.println(b);
		
		char c = 56; //아스키코드로 출력
		System.out.println( c );
		char d = 'a'; //따옴표로 문자 출력
		System.out.println( d );
		
		int data;
		data = 5/3;
		System.out.println( data );

	}

}
