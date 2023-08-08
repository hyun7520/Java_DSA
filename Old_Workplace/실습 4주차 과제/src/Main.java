import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[] = new int[3];
		System.out.println("3개의 정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		//for(int a = 0; a < number.length; a++)
		number[0] = sc.nextInt();
		number[1] = sc.nextInt();
		number[2] = sc.nextInt();
		
					
		for(int a = 0; a < number.length; a++) {
			for(int b = a + 1; b< number.length; b++) {
				if(number[a] < number[b]) {
					int c = number[a];
					number[a] = number[b];
					number[b] = c;
				}
			}
			
			
		}
		System.out.println("큰 수 부터 출력");
		for(int a = 0; a < 3; a++) {
			System.out.println(number[a]);
		}
		sc.close();
	}

}
