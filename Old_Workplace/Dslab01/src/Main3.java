import java.util.Scanner;
public class Main3 {
	static boolean check(String str) {
		char[] stack = new char[str.length()];
		int top = -1;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == '(' || c == '{' || c =='[') {
				stack[++top] = c;
			}
			else if(c == ')' || c == '}' || c ==']') {
				if(top == -1) return false;
				char v = stack[top--];
				if(c==')' && v!= '(') return false;
				if(c=='}' && v!= '{') return false;
				if(c==']' && v!= '[') return false;
			}
		}
		return top == -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(check(str) == true) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}

}
