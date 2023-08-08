import java.util.Scanner;

public class Main2 { //int ��� double�� �ᵵ �ȴ�.
	static int error = -10000;
	static int postCalc(String expr) {
		//���� �����
		int[] stack = new int[1000];
		int top = -1;
		for(int i = 0; i < expr.length(); i++) {
			char c = expr.charAt(i);
			//c�� ���� ������ ���
			if(c >= '0' && c <= '9') {
				stack[++top] = c -'0'; 
				//c - '0' ���� ������ c���� ������ 0�� ���� ���� ���ڸ� ������ ��������.
				//ex '3'�̶� ���ڴ� '0'�̶� ���ں��� 3 ū ���̴�.				
			}
			
			else if(c =='+' || c == '-' || c == '*' || c=='/') {
				if(top < 1) return error; 
				//����� �ʿ��� ���ڴ� 2��, ������ 0�̸� �ڷ� 1��, -1�̸� ����
				//��� top<1�� ���ÿ� �ڷᰡ 2������ ���� ���� ������ �߻���Ų��.
				int b = stack[top--];
				int a = stack[top--];
				int r = error;
				if(c == '+') r = a+b;
				else if(c == '-') r = a-b;
				else if(c == '*') r = a*b;
				else if(b == 0) return error;
				else r = a/b;
				stack[++top] = r;
			}
		}
		return top==0? stack[top]:error;
		//top�� 0�̸� ������ top���� ��ȯ �׷��� ���� ��� ���� ��ȯ
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String expr = sc.nextLine();
		int r = postCalc(expr);
		System.out.println(expr + " = " + r);
		sc.close();
	}

}
