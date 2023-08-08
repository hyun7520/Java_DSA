package 역량강화8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class 취소 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int ans = 0;
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(bf.readLine());
			if(temp == 0) {
				stack.pop();
			}
			stack.push(temp);
		}
		while(!stack.empty()) {
			ans += stack.peek();
			stack.pop();
		}
		System.out.println(ans);
	}

}


/*BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

int N = Integer.parseInt(bf.readLine());
ArrayList<Integer> arr = new ArrayList<Integer>();
int temp = 0;
int ans = 0;
int index = 0;

for(int i = 0; i < N; i++) {
	temp = Integer.parseInt(bf.readLine());
	if(temp == 0) {
		index = arr.size() - 1;
		arr.remove(index);
	}
	arr.add(temp);
}
for(int i = 0; i < arr.size(); i++) {
	System.out.println(arr.get(i));
	ans += arr.get(i);
}
System.out.println(ans);*/