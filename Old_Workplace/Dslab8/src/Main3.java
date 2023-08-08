import java.util.Scanner;
public class Main3 { //������ ����
	static boolean check(String str) {
		char[] stack = new char[100]; //char�� �������� Ÿ�� 
		//100 ��ſ� str.length() ��� �ᵵ �ȴ�
		int top = -1;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == '(' || c == '{' || c== '[') {
				stack[++top] = c; //push
			// ||�� �Ǵ� �� �ǹ̸� ������ �ִ�
			// ��ȣ �ݱ��� ��� ���ÿ� ���� ����
			}
			else if(c == ')' || c == '}' || c ==']') {
				if(top == -1) /* ������ ����ִٸ� */return false;
				char v = stack[top--]; //top�� pop�� ���ÿ�
				if(c == ')' && v!= '(') return false; 
				if(c == '}' && v!= '{') return false; //�� �� ������� ((})�� yes�� ����
				if(c == ']' && v!= '[') return false;
				//c�� ���� ������ ���� ¦�� ���� ������ false
				//������ ����ִ��� Ȯ�� -> ���� ���� ���⸦ pop, v�� ���� �� ��
			}
		}
		return top == -1; 
		//������ ����ִ��� Ȯ��, return true �� ��� ())�� True ��� ����
	}
	//���� �Է��ص� �����Ѵ�.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		if(check(str)) {
			System.out.println("yes"); 
		}
		else {
			System.out.println("No");
		}
		// �ѹ��� println(check(str)?"yes":"no"); �� �������ִ�.
	}

}
