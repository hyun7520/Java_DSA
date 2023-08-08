package 역량강화8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 괄호 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		String str = st.nextToken();
		Stack<Character> stack = new Stack<Character>();
		boolean check = true;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == '(') stack.push(c);
			else if(stack.empty()) {
				check = false;
				break;
			}
			else if(c == ')') {
				stack.pop();
			}
		}
		if(!check) System.out.println(":(");
		else if(stack.empty()) {
			System.out.println(":)");
		}
	}
}
