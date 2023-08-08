package Âü°í;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String key = sc.next();
		int[] arr = new int[20];
		int count = 0;
		
		for(int i = 0; i < key.length(); i++) {
			for(int j = i+1; j < key.length() + 1; j++) {
				String b = key.substring(i, j);
				System.out.println(b);
				int h = b.hashCode() & 0x7fffffff;
				arr[count++] = h;
			}	
		}
		for(int i = 0; i < arr.length; i++) System.out.println(arr[i]);
	}

}
