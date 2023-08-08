import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1번 문제");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + b);
		
		System.out.println("2번 문제");
		int score = sc.nextInt();
		String grade = "";
		if(score >= 90) grade = "A";
		else if(score <= 89 && score >= 80) grade = "B";
		else if(score <= 79 && score >= 70) grade = "C";
		else if(score <= 69 && score >= 60) grade = "D";
		else grade = "F";
		System.out.println(grade);
		
		System.out.println("3번 문제");
		int num = sc.nextInt();
		for(int i = 1; i < num + 1; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("4번 문제");
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			sum += arr[i];
		}
		int min, max;
		min = max = arr[0];
		for(int i = 0; i < n; i++) {
			if(min > arr[i]) min = arr[i];
			if(max < arr[i]) max = arr[i];
		}
		System.out.println(sum+" "+min+" "+max);
		
		System.out.println("5번 문제");
		String OX = sc.next();
		int count = 0;
		int point = 0;
		char[] check = new char[OX.length()];
		for(int i = 0; i < OX.length(); i++) {
			check[i] = OX.charAt(i);
		}
		for(int i = 0; i < OX.length(); i++) {
			if(check[i] == 'O') {
				count++;
				point += count;
			}
			else if(check[i] == 'X') {
				count = 0;
			}
		}
		System.out.println(point);
		
		System.out.println("6번 문제");
		int origin = sc.nextInt();
		int number = origin;
		int loop = 0;
		while(true) {
			number = (number/10 + number%10)%10 + number%10*10;
			loop++;
			if(number == origin) {
				System.out.println(loop);
				break;
			}
		}
		sc.close();
	}
}
