import java.util.Scanner;
public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원): ");
		int won = sc.nextInt();
		final double rate = 1100.0;
		
		double dollar = won/rate;
		System.out.println(dollar + "$");
		
		sc.close();
	}
	

}
