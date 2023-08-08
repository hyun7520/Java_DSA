import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 입력하시오");
		String s;
		char c;
		
		System.out.println("소문자 알파벳을 입력 >");
		s = sc.next();
		c = s.charAt(0);
		
		for(int i=0; i<=c-'a'; i++) {
			for(char j='a'; j<=c-i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
