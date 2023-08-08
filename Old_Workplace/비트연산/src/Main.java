import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("dec to bin");
		System.out.print(">");
		
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		sc.close();
		
		byte[] bin = new byte[100];
		int cnt = 0;
		while(dec!=0) {
			bin[cnt++] = (byte)(dec%2);
			dec = dec/2;
		}
		for(int i = 0; i<cnt; i++) {
			System.out.print(bin[cnt-1-i]);
		}
		
		System.out.println();
		//byte flag = 0b00001010;
		//byte flag = 0b00000110;
		
		//byte flag = 0xa;
		//byte flag = 0x6;
		byte flag = 6;
		
		if( (flag&0b00001000)==0)
			System.out.println("온도는 0도 미만");
		else
			System.out.println("온도는 0도 이상");
	}

}
