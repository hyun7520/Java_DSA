class car {
	private int speed;

	public int getSpeed() {
		return speed;
	}
	
	car () {}
	car(int speed) {
		this.speed = speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}

class Taxi extends car {
	private int price;
	Taxi(int p) {
		price = p;
	}
	void meter() {
		System.out.println("���� ���: "+price+"��");
		System.out.println("�ý� �ӵ�: "+getSpeed());
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi kakao = new Taxi(3500);
		kakao.setSpeed(70);
		System.out.println(kakao.getSpeed());
		kakao.meter();
		/*
		car sonata = new car(40);
		//sonata.setSpeed(50);
		System.out.println("���� �ӵ��� "+sonata.getSpeed());
		*/

	}

}
