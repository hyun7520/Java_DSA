import java.util.Scanner;
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char grade;
		System.out.print("������ �Է��ϼ���: ");
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
		System.out.println("������ " +grade+ " �Դϴ�");
		
		sc.close();
	}
	
}
