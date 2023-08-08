import java.util.Scanner;
public class Main {
	static int add(int a, int b) {
		int c = a + b;
		return c;
	}
	static void printName(String name) {
		System.out.println("My name is " + name + ".");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=10; i+=2) {
			System.out.println("i =" + i );
		}
		int[] array = new int[10]; // Make a array variable size 10
		// Assign 1~10 to the array variable
		for(int i = 0; i<10; i++) {
			array[i] = i+1;
		}
		//print the array variable
		for(int i = 0; i < 10; i++) {
			System.out.println("array["+i+"] = "+array[i]);
		}
		//print 2's power numbers
		for(int i = 1; i < 100; i*=2) {
			System.out.println("i =" + i);
		}
		for(int i = 1; i < 100; i+=i) { 
			System.out.println("i =" + i);
		}
		// while loop, print 1~10
		// same for(int i = 1; i <= 10; i++)
		//int i= 1;
		//while(i <= 10) {
		//	System.out.println("i =" + i);
		//	i++;
		//}
		for(int i = 1; i <= 10; i++) {
			if(i%3 != 0) continue;
			System.out.println(i);
		}
		// make 10 sized string array
		// input strings
		// Print strings
		Scanner scan = new Scanner(System.in);
		String[] strs = new String[10];
		int count = 0;
		while(count < 10) {
			String str = scan.next();
			if( str.equals("quit") ) break;
			strs[count] = str;
			count++;
		}
		for(int i = 0; i < count; i++) {
			System.out.println(strs[i]);
		}
		System.out.println("2 + 5 =" + add(2, 5));
		// using printName
		printName("sanghyun");
	}
}
