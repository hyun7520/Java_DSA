import java.util.Scanner;

class King {
	private String name, time;
	
	public King(String name, String time) {
		this.name = name;
		this.time = time;
	}
	
	void show() {
		System.out.println("조선"+time+"대왕 "+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return name;
	}
	public void setTime(String time) {
		this.time = time;
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu = -1, size = 0;
		String name = "", time = "";
		King[] king = new King[10];
		
		System.out.println("[menu]\n0 : exit\n1 : input (array)\n2 : show (array)\n3 : menu");
		
		Scanner sc = new Scanner(System.in);
		
		while(menu != 0) {
			System.out.print(">");
			menu = sc.nextInt(); 
			switch(menu) {
			case 0:
				System.out.println("종료되었습니다");
				System.exit(0);
				break;
			case 1:
				System.out.print("왕의 이름 > ");
				name = sc.next();
				System.out.print("왕의 순서 > ");
				time = sc.next();
				king[size++] = new King(name, time);
				break;
			case 2:
				for(int i = 0; i < size; i++) {
					king[i].show();
				}
				System.out.println();
				break;
			case 3:
				System.out.println("[menu]\n0 : exit\n1 : input (array)\n2 : show (array)\n3 : menu");
				break;
			}
		}
	}
}