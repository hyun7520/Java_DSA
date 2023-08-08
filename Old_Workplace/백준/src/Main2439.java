import java.util.Scanner;
public class Main2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Á¡Âï±â");
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < N; i++) {
			for(int j = N; j > i+1; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
