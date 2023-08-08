import java.util.Scanner;

class Car {
	int fuel;                 //�ڵ����� ���� �ʵ�
	int engine;               //�ڵ����� ���� �ʵ�
	int material;             //�ڵ����� ���� �ʵ�
	String model;             //�ڵ����� �𵨸� �ʵ�
	
	public Car() {
		fuel = 0; engine = 0; material = 0; model = "";
	}
	
	public Car(int a, int b, int c, String n) {
		fuel = a; engine = b; material = c; model = n;
	}

	public int distance() {   //�Ÿ� ��� �޼ҵ�
		return fuel*engine;
	}
	public int life() {       //�ڵ����� ���� ��� �޼ҵ�
		return distance()/material;
	}
	
}

public class Main2 {

	public static void main(String[] args) {
		System.out.println("�ڵ����� Ŭ���� �� ��ü");
		Scanner sc = new Scanner(System.in);
		Car goodcar = new Car(10, 20, 10, "���� �ڵ���");
		
		int �Ÿ� = goodcar.distance();
				
		Car badcar = new Car(5, 2, 2, "���� �ڵ���");
		
		goodcar.fuel = sc.nextInt();      //�ڵ����� ���ᰪ �Է�
		goodcar.engine = sc.nextInt();    //�ڵ����� ������ �Է�
		goodcar.material = sc.nextInt();  //�ڵ����� ���� 
		goodcar.model = "���� �ڵ���";       //�ڵ����� �𵨸� �Է�
		
		System.out.println(goodcar.model + "�� �ִ� " + goodcar.distance() + "Km�� �޸����ְ� " + goodcar.life() + "�� ���� ����� �� �ִ�.");
		sc.close();

	}

}
