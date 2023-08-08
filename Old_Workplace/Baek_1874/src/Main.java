import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();
		
		int N = Integer.parseInt(bf.readLine());
		int start = 0;
		
		while(N > 0) {
			
			int m = Integer.parseInt(bf.readLine());
			
			if(m > start) {
				for(int i = start + 1; i <= m; i++) {
					stack.push(i);
					sb.append('+').append('\n');
				}
				start = m;
			}
			
			else if(stack.peek() != m) {
				System.out.println("NO");
				System.exit(0);
			}
			
			stack.pop();
			sb.append('-').append('\n');
			
			N--;
		}
		System.out.println(sb);
	}
}
