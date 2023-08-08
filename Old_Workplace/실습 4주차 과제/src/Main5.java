import java.util.Scanner;
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char grade;
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		switch(score/10) {
		case 10:
		case 9:
			grade = 'a';
			break;
		case 8:
			grade = 'b';
			break;
		case 7:
			grade = 'c';
			break;
		case 6:
			grade = 'd';
			break;
		default:
			grade = 'f';
			break;
		}
		System.out.println("학점은 " +grade+ " 입니다");
		
		sc.close();
	}
	
}
