
public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("타입변환");
		
		char ch = 'A';
		int a = ch; // char -> int 자동타입변환
		System.out.println( a ); //대문자 A에 대한 아스키코드 출력
		
		//강제 타입 변환
		
		a = 104;
		ch = (char)a; //int -> char 
		System.out.println( ch ); //a가 아닌 h가 출력
		
	}
}
