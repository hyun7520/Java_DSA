import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String name = "°í»óÇö";
		
		for(int i = 0; i <= n; i++) {
			System.out.print(name + " ");
			if((i+1) % 5 == 0)
				System.out.println();
		}
	}
}
