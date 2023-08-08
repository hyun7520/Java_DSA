import java.util.Scanner;

public class Main {
	static int error = -1000;
	static int cal(String num) {
		int[] stack = new int[1000];
		int top = -1;
		String[] arr = num.split(" ");
		for(int i = 0; i < arr.length; i++) {
			if(!arr[i].equals("+") && !arr[i].equals("-") && !arr[i].equals("*") && !arr[i].equals("/") && !arr[i].equals("=")) {
				int c = Integer.parseInt(arr[i]);
				stack[++top] = c;
			}
			else if(arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("/")) {
				if(top < 1) return error;
				int right = stack[top--];
				int left = stack[top--];
				int result = error;
				if(arr[i].equals("+")) result = left + right;
				else if(arr[i].equals("-")) result = left - right;
				else if(arr[i].equals("*")) result = left * right;
				else if(right == 0) return error;
				else result = left/right;
				stack[++top] = result;			
			}
		}
		return arr[arr.length-1].equals("=")? stack[top]:error;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int a = cal(num);
		System.out.println(a);

	}
}
