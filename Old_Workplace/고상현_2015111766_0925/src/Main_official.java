import java.util.Scanner;
public class Main_official {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int i = 0, flag = 0;
		
		while(true) {
			System.out.print("i(1~12) > ");
			i = sc.nextInt();
			if(i == 13) {
				break;
			}
			flag = flag | (1<<(i-1)); // |�� or ������ flag�� (1<<3)�� or �Ͽ� �� �� �ϳ��� 1�̾ 1��
									  // ex) flag�� 00001 (1<<3)=01000 ���� | �ϸ� 01001�� �ȴ�.
			System.out.printf("%08x\n", flag);
		}
	
	}

}
