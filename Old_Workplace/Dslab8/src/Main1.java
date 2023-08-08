import java.util.Scanner;
public class Main1 {  //스택 구현 다른 방법

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
			//증감연산자가 앞에 붙으면 증감 후 값반환, 뒤에 붙으면 증감 전 값 반환
		}
		while(top != -1) {  //top가 비어있지 않다면
			//top() -> stack[top]
			System.out.println(stack[top]);
			//pop() -> top--
			top--;
		}

	}

}
