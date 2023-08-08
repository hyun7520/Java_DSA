import java.util.Scanner;

public class Main {
	
	public static void binary(int dec) {
		byte[] bin = new byte[100];
		int cnt = 0;
		while(dec!=0) {
			bin[cnt++] = (byte)(dec%2);
			dec = dec/2;
		}
		for(int i = 0; i<cnt; i++) {
			System.out.print(bin[cnt-1-i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("실습과제: 비트연산");
		Scanner sc = new Scanner(System.in);
		System.out.println("i(1~12) > ");
		
		int i = sc.nextInt();
		int flag = 0;
		
		while(i != 13) {
			flag = (short) (flag | (1 << i - 1));
			String hex = Integer.toString(flag, 16);
			System.out.println(hex);
			i = sc.nextInt();
			if(i == 13) {
				System.out.println("비트 설정 종료~");
				break;
			}
		}
		sc.close();
	}
}
