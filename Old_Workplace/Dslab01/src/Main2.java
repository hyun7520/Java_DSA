import java.util.Scanner;
class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] stack= new int[100];
		int top = -1;
		for(int i = 0; i < 10; i++) {
			stack[++top] = sc.nextInt();
		}
		while(top != -1) {
			System.out.println(stack[top]);
			top--;
		}

	}

}
