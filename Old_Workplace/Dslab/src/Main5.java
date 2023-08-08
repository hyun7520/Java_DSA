import java.util.Scanner;
public class Main5 {

	 static int countcheck(int N) {
	        int check = 0;
	        for(int i = 1;i < N;i++) {
	            if(N % i == 0) {
	                check++;
	            }
	        }
	        return check;
	    }
	    public static void main(String[] args) {
	        int count = 0;
	        for(int i = 2;i <= 1000;i++) {
	            if(countcheck(i) == 1) {
	                count++;
	            }
	        }
	        System.out.println(count);
	    }
	}