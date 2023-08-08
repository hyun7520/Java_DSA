import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu= 5, size = 0;
		int arr[] = new int[10];
		System.out.println("[menu]\n0 : exit\n1 : input (array)\n2 : show (array)\n3 : menu");
		
		Scanner sc = new Scanner(System.in);
		while(menu != 0) {
			System.out.print("n>");
			menu = sc.nextInt(); 
			switch(menu) {
			case 0:
				System.out.println("종료되었습니다");
				System.exit(0);
				break;
			case 1:
				System.out.print("정수 (개수, 값) >");
				size = sc.nextInt();
				for(int i = 0; i<size; i++) {
					arr[i]=sc.nextInt();
				}
				System.out.println("입력완료");
				break;
			case 2:
				for(int i = 0; i < size; i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
				break;
			case 3:
				System.out.println("[menu]\n0 : exit\n1 : input (array)\n2 : show (array)\n3 : menu");
				break;
			}
		}
	}
}
