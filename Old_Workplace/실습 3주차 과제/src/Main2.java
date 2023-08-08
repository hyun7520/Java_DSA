import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력, 끝에 end 입력");
		
		int n = sc.nextInt();
		while(n != -1) {
			sum += n;
			count++;
			n = sc.nextInt();
		}
		System.out.print("정수의 개수는 " +count+ "개이며");
		System.out.println("평균은" +(double)sum/count+ "입니다.");

	}

}
