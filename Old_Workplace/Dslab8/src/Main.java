import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		String str = scan.next();
		System.out.println(str); //�����̽��� ���� ���� �Ĵ� �ν� X
		System.out.println(str + "'s length is" + str.length());
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i); //�迭�� 0���� i���� ���ڿ� ���
			System.out.println(c);
		}

	}

}
