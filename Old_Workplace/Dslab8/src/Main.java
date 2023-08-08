import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		String str = scan.next();
		System.out.println(str); //스페이스로 만든 공백 후는 인식 X
		System.out.println(str + "'s length is" + str.length());
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i); //배열의 0부터 i까지 문자열 출력
			System.out.println(c);
		}

	}

}
