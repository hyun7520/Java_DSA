import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int card; //��ǻ�Ͱ� ����� ����
		int low, high;
		Random r = new Random();
		
		while(true) {
			int tries = 0;
			low = 0;
			high = 99;
			card = r.nextInt(100);
			System.out.println("���ڸ� ���Ͽ����ϴ�.");
			
			while(true) {
				System.out.println(low + "-" + high);
				System.out.print(tries+1+">");
				int number = 0; // �Է��ϴ� ����
				
				try {
					 number = sc.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("������ �Է��ؾ��Ѵ�");
					sc.nextLine();
					continue;
				}
				if(number > high || number < low) 
					System.out.println("������ ���");
				else {
					if(number == card) {
						System.out.println("�¾ҽ��ϴ�");
						break;
					}
					else if(number > card) {
						System.out.println("�� ����");
						high = number;
				    }
					else {
						System.out.println("�� ����");
						low = number;
					}
				}
				tries++;
			}
			System.out.print("�ٽ� �Ͻðڽ��ϱ�");
			if(sc.next().equals("N"))
				break;
		}
		
		sc.close();
	}

}
