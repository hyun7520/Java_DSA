import java.util.Scanner;
//stack class
class Node {
	int data;
	Node next;
	Node(int e) { data = e; next = null; }
}
class ListStack {
	Node head; 
	ListStack() {
		head = null;
	}
	void push(int e) {            
		Node node = new Node(e); 
		node.next = head;         
		head = node;              
	}
	void pop() {
		head = head.next;
	}
	int top() {
		return head.data;
	}
	boolean empty() { //������ ����ִ��� Ȯ��
		return head == null;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Ǳ� ���� 1��");
		Scanner sc = new Scanner(System.in);
		ListStack stack = new ListStack();
		
		stack.push(sc.nextInt());
		stack.push(sc.nextInt());
		stack.push(sc.nextInt());
		
		System.out.print("top -> ");
		while(stack.empty() == false) {
			System.out.print(stack.top()+"\t");
			stack.pop();
		}
		System.out.println();
	
		System.out.println("�Ǳ� ���� 2��");
	
		String str = sc.next();
		if(check(str) == -1) {
			System.out.println("����");
		}
		else if(check(str) == -2) {
			System.out.println("1�� ���� ����");
	    }
		else if(check(str) == -4) {
			System.out.println("1�� ���� ����");
		}
}

	private static int check(String str) {
		char[] stack = new char[str.length()];
		int top = -1;
		for(int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if(a == '{' || a == '(' || a == '[') {
				stack[++top] = a;
		    }
			else if(a == '}' || a == ')' || a == ']') {
			if(top == -1)  return -1;
	        char b = stack[top--];
	        if(a == '}' && b != '{') return -2;
	        if(a == ']' && b != '[') return -2;
			if(a == ')' && b != '(') return -2;
			}
		}
	
	        return -1;
		}
	}


