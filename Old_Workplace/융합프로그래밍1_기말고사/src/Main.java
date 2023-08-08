import java.util.Random;
import java.util.Scanner;

class Example {
	
	void plot(int a) {
		for(int i = a; i > 0; i--) {
			for(int j =1; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void plot(String b, int a) {
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < a - i; k++) {
				System.out.print(b);
			}
			System.out.println("");
		}
	}
	void rand_alpha(int a) {
		char[] arr = new char[a];
		
		for(int i = 0; i < a; i++) {
			char r_word = (char) (Math.random()*10 + 'a');
			arr[i] = r_word;
		}
		for(int j = 0; j < a; j++) {
			System.out.print(arr[j]);
		}
		System.out.println();
		
	}
	void times(int a, String b) {
		for(int i = 0; i < b.length(); i++) {
			char temp = b.charAt(i);
			for(int j = 0; j < a; j++)
				System.out.print(temp);
		}
		System.out.println();
	}
	static boolean toggle(boolean t_f) {
		if(t_f == false) {
			return true;
		}
		else if(t_f == true) {
			return false;
		}
		return false;
	}
}

class Goods {
	private int price;
	
	public Goods(int i) {
		price = i;
	}
	int get_price() {
		return price;
	}
}
class Printer {
	private boolean boo;
	private int price;

	public Printer(boolean b, int i) {
		boo = b;
		price = i;
	}
	void show() {
		System.out.println("양면 출력 기능이 있다 : "+boo);
		System.out.println("프린터 가격은 "+price);
		
	}
	
}


public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("1번 문제");
		Example ex = new Example();
		System.out.println("1-1)");
		ex.plot(4);
		System.out.println("1-2)");
		ex.plot("#", 5);
		System.out.println("1-3)");
		ex.rand_alpha(7);
		System.out.println("1-4)");
		ex.times(3, "ABC");
		System.out.println("1-5)");
		System.out.println(Example.toggle(false));
		System.out.println();
		System.out.println("2번 문제");
		
		Goods desk = new Goods(300000);
		System.out.println("책상의 가격은 "+desk.get_price()+"원");
		
		System.out.println();
		System.out.println("3번 문제");
		Printer hp = new Printer(true, 200000);
		hp.show();
	}
}
