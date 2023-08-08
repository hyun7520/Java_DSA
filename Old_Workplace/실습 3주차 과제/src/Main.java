import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java 실습 과제 2");	
		int number2 = 0;
		int number3 = 0;
		int number4 = 0;
		int sum = 0;
		int division1 = 0;
		
		System.out.println("정수 입력 >");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		number2 = number1%10;
		division1 = number1/10;
		number3 = (division1)%10;
		number4 = (division1/10)%10;
		sum = number2 + number3 + number4;
			
		System.out.println(sum);
		
		sc.close();

	}

}
