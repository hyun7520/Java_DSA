import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է�, ���� end �Է�");
		
		int n = sc.nextInt();
		while(n != -1) {
			sum += n;
			count++;
			n = sc.nextInt();
		}
		System.out.print("������ ������ " +count+ "���̸�");
		System.out.println("�����" +(double)sum/count+ "�Դϴ�.");

	}

}
