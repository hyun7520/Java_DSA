import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       long a = sc.nextLong();
       long b = sc.nextLong();
       
       while(b !=0 ) {
    	   long c = a%b;
    	   a = b;
    	   b= c;
       }
       System.out.println(a);
       sc.close();
	}
}