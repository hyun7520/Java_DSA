import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println("[menu]\n1 : ��ǥ�Է�\n2 : �簢�� �����ȿ� �ִ°�?\n3 : �޴�\n4 : ����");
		
		int mode = sc.nextInt();
		
		 while(mode != 4) {
			mode = sc.nextInt();
			switch(mode) {
			case 1:
				x = sc.nextInt();
				y = sc.nextInt();
				break;
			case 2:
				if( x >= 50 && x <= 100) {
					if( y >= 50 && y <= 100) {
						System.out.println("yes");	
					}
				}
				else;
					System.out.println("no");
				break;
			case 3:
				System.out.println("[menu]\n1 : ��ǥ�Է�\n2 : �簢�� �����ȿ� �ִ°�?\n3 : �޴�\n4 : ����");
				break;
			case 4:
				System.out.println("����");
				System.exit(0);
				break;

			}
		}

	}

}
