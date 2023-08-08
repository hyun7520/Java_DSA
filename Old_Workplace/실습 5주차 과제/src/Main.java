import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int end;
		
		System.out.println("ASCII출력 끝 번호 입력 >");
		end = sc.nextInt();
		
		for(int i = 32; i <= end; i++) {
			System.out.print((char)i + " ");
			if((i + 1)%16 ==0)
				System.out.println();
		}
		sc.close();
	}

}
