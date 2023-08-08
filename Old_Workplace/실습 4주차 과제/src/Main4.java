import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number[] = new int[3];
		
		/*number[0] = sc.nextInt();
		number[1] = sc.nextInt();
		number[2] = sc.nextInt();*/
		for(int a = 0; a < number.length; a++) {
			number[a] = sc.nextInt();
		}
		for(int a = 0; a < number.length; a++) {
			for(int b = a + 1; b < number.length; b++) {
				if(number[a] > number[b]) {
					int c = number[a];
					number[a] = number[b];
					number[b] = c;
					
				}
			}
		}
		for(int a = 0; a < number.length; a++) {
			System.out.println(number[a]);
		}
		sc.close();

	}


}
