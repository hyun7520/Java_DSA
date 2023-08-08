import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Welcome!!");
			System.out.print("Hello");
			System.out.println(" wow");
			int a;
			a = 5;
			System.out.println("a = " +a);
			int b = 10;
			System.out.println("b = " +b);
			long c = 10000000000L;
			System.out.println("c = " +c);
			Integer d = new Integer(0);
			System.out.println("d = " +d);
			String str = new String("Name");
			System.out.println(str);
			int[] array = new int[10];
			System.out.println("array[5] = "+array[5]);
			array[5] = 3;
			System.out.println("array[5] = "+array[5]);
			
			String[] sarray = new String[10];
			System.out.println("sarray[5] = "+sarray[5]);
			sarray[5] = new String("Also");
			System.out.println("sarray[5] = "+sarray[5]);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = scan.next();
			System.out.print("how old are you?");
			int age = scan.nextInt();
			System.out.println("My name is "+name+".");
			System.out.println("My age is "+age+".");
			
			scan.close();
			
			for(int i = 1; i <=100; i++);
			for(int i = 1; i <=100; i+=2);
			for(int i = 0; i < 100; i++);
			
	}

}
