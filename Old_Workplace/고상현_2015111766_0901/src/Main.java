import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		
		while(true) {
			System.out.println("ATM �ӽ�");
			System.out.println("1. �Ա�");
			System.out.println("2. ���");
			System.out.println("3. ��ȸ");
			System.out.println("4. ����");
			System.out.print("menu>>");
			
			int n = sc.nextInt();
			
			switch(n) {
			case 1:
				System.out.println("�Ա�(����)");
				int k = sc. nextInt();
				if(money != 0) {
					money += k;
					break;
				}
				else money = k;
				break;
			case 2:
				System.out.println("���(����)");
				int j = sc.nextInt();
				if(money < j) {
					System.out.println("�ܾ׺���");
					break;
				}
				else {
					money -= j;
					break;
				}
					
			case 3:
				System.out.println("���� �ܾ���"+money+"�����Դϴ�");
				break;
			case 4:
				System.out.println("ATM ����");
				System.exit(0);
				
			}
		}	
	}
}


