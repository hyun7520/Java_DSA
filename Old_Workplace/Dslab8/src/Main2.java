import java.util.Scanner;
public class Main2 { //괄호쌍 검사 학우 예시
	static boolean check(String str) {
        char[] stack = new char[100];
        int top = -1;
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stack[i] = c; // 문제 스택 stack[++top]; 으로 작성해야한다
                top++;
            } else if(c == ')') {
                if(((int) stack[top] - (int) c) == -1) {//아스키 코드를 고려하여 만든 코드
                    top--;
                }else {
                    return false;
                }
            } else if(c == '}' || c == ']') {
                if(((int) stack[top] - (int) c) == -2) {
                    top--;
                }else {
                    return false;
                }
              }
           }
        return true;
        }
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

	}

}
