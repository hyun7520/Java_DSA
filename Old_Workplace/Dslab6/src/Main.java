import java.util.Scanner;
//stack class
class Stack {
	int[] data;    // 스택 데이터를 저장하는 배열
	int top;       //스택의 가장위를 알려주는 변수, 데이터가 없을 경우 -1이 가장 타당
	Stack() {      //생성자, 클래스 이름과 같아야함
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
	boolean empty() { //스택이 비어있는지 확인
		return top == -1;  // return false; 같은 의미
		//return top == -1; 이미 top == -1 은 true
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
