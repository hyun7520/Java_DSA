import java.util.Scanner;
class Stack {
	int[] data;
	int top;
	Stack() {
		data = new int[100];
		top = -1;
	}
	void push(int e) {
		data[++top] = e;
	}
	void pop() {
		top--;
	}
	int top() {
		return data[top];
	}
	boolean empty() {
		return top == -1;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		for(int i = 0; i < 10; i++) {
			stack.push(sc.nextInt());
		}
		while(stack.empty()==false) {
			System.out.println(stack.top());
			stack.pop();
		}

	}

}
