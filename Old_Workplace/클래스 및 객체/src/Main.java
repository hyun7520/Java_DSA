
//Ŭ������ ����
class Circle {
	//�Ӽ�
	int radius; 
	String name; //�ʵ�
	
	//�޼ҵ�
	void area() {
		System.out.println("����: "+ radius*radius*3.14); //Ŭ������ �ش��ϴ� �ʵ�� �޼ҵ忡�� ������� �� �� �ִ�.
	}
	
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ŭ���� �� ��ü");
		Circle pizza; //���۷��� ����
		pizza = new Circle(); //��ü ���� -> ������� 
		
		pizza.radius = 20;
		pizza.name = "ȫ�浿";
		
		System.out.println(pizza.radius + " " + pizza.name);
		
		pizza.area(); //�޼ҵ� ȣ��
		
		//������� .0 �� ������ �ڵ� Ÿ�Ժ�ȯ �����̴�

	}

}
