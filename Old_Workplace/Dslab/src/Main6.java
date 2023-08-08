import java.util.Scanner;
 
public class Main6 {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int count = 0;
    	double root = Math.sqrt((double)n);
    	
    	for(int i = 2; i <= n; i++) {
    		for(int j = 2; j <= root; j++) {
    			if(i%j == 0 && i!=j) {
    				count++;
    			}
    		}
    	}
    	System.out.println(count);
   
    }
}
