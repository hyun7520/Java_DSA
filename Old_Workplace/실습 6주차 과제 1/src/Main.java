import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int card; //컴퓨터가 숨기는 숫자
		int low, high;
		Random r = new Random();
		
		while(true) {
			int tries = 0;
			low = 0;
			high = 99;
			card = r.nextInt(100);
			System.out.println("숫자를 정하였습니다.");
			
			while(true) {
				System.out.println(low + "-" + high);
				System.out.print(tries+1+">");
				int number = 0; // 입력하는 숫자
				
				try {
					 number = sc.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("정수만 입력해야한다");
					sc.nextLine();
					continue;
				}
				if(number > high || number < low) 
					System.out.println("법위를 벗어남");
				else {
					if(number == card) {
						System.out.println("맞았습니다");
						break;
					}
					else if(number > card) {
						System.out.println("더 낮게");
						high = number;
				    }
					else {
						System.out.println("더 높게");
						low = number;
					}
				}
				tries++;
			}
			System.out.print("다시 하시겠습니까");
			if(sc.next().equals("N"))
				break;
		}
		
		sc.close();
	}

}
