import java.util.Scanner;

class Car {
	int fuel;                 //�ڵ����� ���� �ʵ�
	int engine;               //�ڵ����� ���� �ʵ�
	int material;             //�ڵ����� ���� �ʵ�
	String model;             //�ڵ����� �𵨸� �ʵ�
	public int distance() {   //�Ÿ� ��� �޼ҵ�
		return fuel*engine;
	}
	public int life() {       //�ڵ����� ���� ��� �޼ҵ�
		return distance()/material;
	}
	
}

public class Main {

	public static void main(String[] args) {
		System.out.println("�ڵ����� Ŭ���� �� ��ü");
		Scanner sc = new Scanner(System.in);
		Car goodcar;            //�ڵ����� ���۷��� ���� ����
		goodcar = new Car();    //�ڵ����� ��ü ����
		
		goodcar.fuel = sc.nextInt();      //�ڵ����� ���ᰪ �Է�
		goodcar.engine = sc.nextInt();    //�ڵ����� ������ �Է�
		goodcar.material = sc.nextInt();  //�ڵ����� ���� 
		goodcar.model = "���� �ڵ���";       //�ڵ����� �𵨸� �Է�
		
		System.out.println(goodcar.model + "�� �ִ� " + goodcar.distance() + "Km�� �޸����ְ� " + goodcar.life() + "�� ���� ����� �� �ִ�.");
		sc.close();

	}

}
