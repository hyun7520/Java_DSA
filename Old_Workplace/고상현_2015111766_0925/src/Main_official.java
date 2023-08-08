import java.util.Scanner;
public class Main_official {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int i = 0, flag = 0;
		
		while(true) {
			System.out.print("i(1~12) > ");
			i = sc.nextInt();
			if(i == 13) {
				break;
			}
			flag = flag | (1<<(i-1)); // |는 or 연산자 flag와 (1<<3)을 or 하여 둘 중 하나만 1이어도 1로
									  // ex) flag가 00001 (1<<3)=01000 둘을 | 하면 01001이 된다.
			System.out.printf("%08x\n", flag);
		}
	
	}

}
