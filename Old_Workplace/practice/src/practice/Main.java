package practice;

import java.util.Scanner;
public class Main {
	static boolean check(String str) {
		char[] stack = new char[str.length()];
		int top = -1;
		for(int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if(a == '{' || a == '(' || a == '[') {
				stack[++top] = a;
	        }
			else if(a == '}' || a == ')' || a == ']') {
				if(top == -1)  return false;
				char b = stack[top--];
				if(a == '}' && b != '{') return false;
				if(a == ']' && b != '[') return false;
				if(a == ')' && b != '(') return false;
			}
		}
      return top == -1;
  }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(check(str) == true) {
			System.out.println("OK");
	    }
		else {
			System.out.println("ERROR");
      }
    }
}