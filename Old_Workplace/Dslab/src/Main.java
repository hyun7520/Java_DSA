import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        
        System.out.print("1부터 n까지의 합을 출력합니다 \n숫자를 입력하세요 > ");
        
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