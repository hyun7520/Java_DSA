package defalut;
import java.util.Scanner;

public class Main2 {
	static void hanoi_order(int n) {
		int top = 1;
		int bi = 0;
		int binary[] = new int[100];
		while(n > 0) {
			binary[top++] = n%2;
			n = n/2;
		}
		for(int i = 1; i < top; i++) {
			if(binary[0] == 1) System.out.println("1");
			else if(binary[0] != 1 && (bi += binary[i]) == 1) {
				System.out.print(i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		hanoi_order(n);
		
		sc.close();			
	}

}
