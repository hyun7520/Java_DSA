import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        
        System.out.print("1���� n������ ���� ����մϴ� \n���ڸ� �Է��ϼ��� > ");
        
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long sum = 0;
        
        for(long b = 0; b <= a; b++) {
        	sum += b;
        }
        System.out.println(sum);
        sc.close();
	}
}