import java.util.Scanner;
public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
				
		for(int i = 2; i <= n; i++) {
			int Prime = 1;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					Prime = 0;
					break;
				}
			}
			if(Prime == 1) {
				count++;
		}
			
		}
		System.out.println(count);
		sc.close();
	}

}
