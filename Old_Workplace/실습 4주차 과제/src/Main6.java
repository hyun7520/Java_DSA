import java.util.Scanner;
public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("ö�� >>");
		String a = sc.next();
		System.out.print("���� >>");
		String b = sc.next();
		
		if(a.equals("����")) {
			if(b.equals("����"))
				System.out.print("�����ϴ�");
			else if(b.equals("����"))
				System.out.print("���� �̰���ϴ�");
			else if(b.equals("��"))
				System.out.print("ö���� �̰���ϴ�");
		}
		if(a.equals("����")) {
			if(b.equals("����"))
				System.out.print("ö���� �̰���ϴ�");
			else if(b.equals("����"))
				System.out.print("�����ϴ�");
			else if(b.equals("��"))
				System.out.print("���� �̰���ϴ�");
		}
		if(a.equals("��")) {
			if(b.equals("����"))
				System.out.print("���ְ� �̰���ϴ�");
			else if(b.equals("����"))
				System.out.print("ö���� �̰���ϴ�");
			else if(b.equals("��"))
				System.out.print("�����ϴ�");
		}
				
		sc.close();
	}

}
