import game.Castle;

class Dragon {
	private int power;
	
	void set(int po) { // setter
		power = po;
	}
	void show() {
		System.out.println("���� �Ŀ�: "+power);
		
	}
	void fire(Castle ca) { //��ü ���� ����
		ca.destroy(power); //�޽��� �н�
	}
}
