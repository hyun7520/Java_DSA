package 참고; //모범답안 교수
import java.util.Scanner;
public class Main2 { //후위연산자
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
				// 스택이 2개의 아이템 미만을 가질 경우 연산자를 위해서 2개가 필요하니 그 미만은 에러
				if(top < 1) return error;
				int b =stack[top--];
				int a = stack[top--];
				int r = error;
				if(c == '+') r = a+b;
				else if(c == '-') r = a-b;
				else if(c == '*') r = a*b;
				else if(b == 0) return error; //나누는 값이 0인 경우 에러가 발생하기에 처리함 
				else r = a/b;
				stack[++top] = r;
			}
		}
		return top == 0? stack[top]:error; // if(top == 0) 이라면 stack[top]이고 그렇지 않다면(else) error다
		//삼항연산 찾아보기
	}
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String expr = sc.next();
		int r = postcalc(expr);
		System.out.println(expr + "=" + r); //소수점 원할경우 int => double로 
		
	}

}
