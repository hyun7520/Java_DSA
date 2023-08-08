import java.util.Scanner;
//stack class
class Stack {
	int[] data;    // ���� �����͸� �����ϴ� �迭
	int top;       //������ �������� �˷��ִ� ����, �����Ͱ� ���� ��� -1�� ���� Ÿ��
	Stack() {      //������, Ŭ���� �̸��� ���ƾ���
		data = new int[100];
		top = -1;
	}
	void push(int e) {
		top = top+1;    // ++top; or top += 1;
		data[top] = e;  // data[++top] = e
	}
	void pop() {	
		top--; // or top = top -1;, top--;
	}
	int top() {
		return data[top];
	}
	boolean empty() { //������ ����ִ��� Ȯ��
		return top == -1;  // return false; ���� �ǹ�
		//return top == -1; �̹� top == -1 �� true
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		for(int i = 0; i < 10; i++) {
			stack.push(sc.nextInt());
		}
		while(stack.empty() == false) {
			System.out.println(stack.top());
			stack.pop();
		}
		sc.close();

	}

}
