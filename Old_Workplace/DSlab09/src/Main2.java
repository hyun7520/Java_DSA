import java.util.Scanner;

public class Main2 { //int 대신 double로 써도 된다.
	static int error = -10000;
	static int postCalc(String expr) {
		//스택 만들기
		int[] stack = new int[1000];
		int top = -1;
		for(int i = 0; i < expr.length(); i++) {
			char c = expr.charAt(i);
			//c가 숫자 문자인 경우
			if(c >= '0' && c <= '9') {
				stack[++top] = c -'0'; 
				//c - '0' 이유 문자인 c에서 문자인 0을 빼면 실제 숫자를 뺀값과 같아진다.
				//ex '3'이란 문자는 '0'이란 문자보다 3 큰 값이다.				
			}
			
			else if(c =='+' || c == '-' || c == '*' || c=='/') {
				if(top < 1) return error; 
				//연산시 필요한 문자는 2개, 스택이 0이면 자료 1개, -1이면 없다
				//고로 top<1은 스택에 자료가 2개보다 적은 경우로 에러를 발생시킨다.
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
		//top가 0이면 스택의 top값을 반환 그렇지 않을 경우 에러 반환
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String expr = sc.nextLine();
		int r = postCalc(expr);
		System.out.println(expr + " = " + r);
		sc.close();
	}

}
