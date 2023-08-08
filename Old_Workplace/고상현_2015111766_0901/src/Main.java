import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		
		while(true) {
			System.out.println("ATM 머신");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 조회");
			System.out.println("4. 종료");
			System.out.print("menu>>");
			
			int n = sc.nextInt();
			
			switch(n) {
			case 1:
				System.out.println("입금(만원)");
				int k = sc. nextInt();
				if(money != 0) {
					money += k;
					break;
				}
				else money = k;
				break;
			case 2:
				System.out.println("출금(만원)");
				int j = sc.nextInt();
				if(money < j) {
					System.out.println("잔액부족");
					break;
				}
				else {
					money -= j;
					break;
				}
					
			case 3:
				System.out.println("현재 잔액은"+money+"만원입니다");
				break;
			case 4:
				System.out.println("ATM 종료");
				System.exit(0);
				
			}
		}	
	}
}


