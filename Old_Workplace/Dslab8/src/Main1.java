import java.util.Scanner;
public class Main1 {  //���� ���� �ٸ� ���

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] stack = new int[100];
		int top = -1;
		for(int i = 0; i < 10; i++) {
			//push
			stack[++top] = scan.nextInt(); 
			//top = top + 1;
			//stack[top] = scan.nextInt(); 
			//���������ڰ� �տ� ������ ���� �� ����ȯ, �ڿ� ������ ���� �� �� ��ȯ
		}
		while(top != -1) {  //top�� ������� �ʴٸ�
			//top() -> stack[top]
			System.out.println(stack[top]);
			//pop() -> top--
			top--;
		}

	}

}
