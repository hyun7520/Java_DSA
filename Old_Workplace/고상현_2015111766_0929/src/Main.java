import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ܾ� ����");
		
		String [][] arr = { {"string", "��"}, {"research", "����" },{"cat", "�����"}, {"dog", "��"}, {"bird", "��"},
				{"pig", "����"}, {"fly", "����"}, {"run", "�޸���"}, {"walk", "�ȴ�"}, {"apple", "���"}
		};
		
		int pt = 0;
		while(true) {
			System.out.println("���� ���� = "+pt);
			if(pt == 3 || pt == -3) break;
			
			int col = (int)(Math.random()*9);
			System.out.println(arr[col][0]);
			System.out.println("�� �Է�>");
			String ans = sc.nextLine();
			
			if(ans.equals(arr[col][1])) {
				pt += 1;
				System.out.println("�����Դϴ�");
			}
			else {
				pt -= 1;
				System.out.println("�����Դϴ�");
			}
		}
		sc.close();
	}

}
