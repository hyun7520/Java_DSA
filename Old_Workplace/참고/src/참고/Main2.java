package ����; //������ ����
import java.util.Scanner;
public class Main2 { //����������
	static int error = -10000;
	static int postcalc(String expr) {
		int[] stack = new int[100];
		int top = -1;
		for(int i = 0; i <expr.length(); i++) {
			char c = expr.charAt(i);
			if(c >= '0' && c <= '9') {
				stack[++top] = c - '0';
			}
			else if(c == '+' || c == '-' || c == '*' || c == '/') {
				// ������ 2���� ������ �̸��� ���� ��� �����ڸ� ���ؼ� 2���� �ʿ��ϴ� �� �̸��� ����
				if(top < 1) return error;
				int b =stack[top--];
				int a = stack[top--];
				int r = error;
				if(c == '+') r = a+b;
				else if(c == '-') r = a-b;
				else if(c == '*') r = a*b;
				else if(b == 0) return error; //������ ���� 0�� ��� ������ �߻��ϱ⿡ ó���� 
				else r = a/b;
				stack[++top] = r;
			}
		}
		return top == 0? stack[top]:error; // if(top == 0) �̶�� stack[top]�̰� �׷��� �ʴٸ�(else) error��
		//���׿��� ã�ƺ���
	}
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String expr = sc.next();
		int r = postcalc(expr);
		System.out.println(expr + "=" + r); //�Ҽ��� ���Ұ�� int => double�� 
		
	}

}
