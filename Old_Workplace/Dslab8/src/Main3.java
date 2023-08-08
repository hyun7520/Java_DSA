import java.util.Scanner;
public class Main3 { //교수님 예시
	static boolean check(String str) {
		char[] stack = new char[100]; //char은 문자저장 타입 
		//100 대신에 str.length() 라고 써도 된다
		int top = -1;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == '(' || c == '{' || c== '[') {
				stack[++top] = c; //push
			// ||는 또는 의 의미를 가지고 있다
			// 괄호 닫기의 경우 스택에 들어가지 않음
			}
			else if(c == ')' || c == '}' || c ==']') {
				if(top == -1) /* 스택이 비어있다면 */return false;
				char v = stack[top--]; //top과 pop을 동시에
				if(c == ')' && v!= '(') return false; 
				if(c == '}' && v!= '{') return false; //한 줄 없을경우 ((})가 yes로 나옴
				if(c == ']' && v!= '[') return false;
				//c의 값과 가져온 값의 짝이 맞지 않으면 false
				//스택이 비어있는지 확인 -> 가장 위의 열기를 pop, v로 저장 후 비교
			}
		}
		return top == -1; 
		//스택이 비어있는지 확인, return true 일 경우 ())가 True 라고 나옴
	}
	//식을 입력해도 동작한다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		if(check(str)) {
			System.out.println("yes"); 
		}
		else {
			System.out.println("No");
		}
		// 한번에 println(check(str)?"yes":"no"); 로 묶을수있다.
	}

}
