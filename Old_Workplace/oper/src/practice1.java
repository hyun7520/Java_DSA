import java.util.Scanner;
public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 >");
		int time = sc.nextInt();
		int second = time % 60;
		int minute = (time/60) % 60;
		int hour = (time/60) / 60;
		
		System.out.println(time);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		sc.close();	
		//예제 2.5
		
		

	}

}
