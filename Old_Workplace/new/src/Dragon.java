import game.Castle;

class Dragon {
	private int power; //ĸ��ȭ ���� private�� ������ ��� �ʵ� ��� private
	void set(int po) {
		power = po;
	}
	void show() {
		System.out.println("�����Ŀ� "+ power);
	}
	void fire(Castle ca) {
		ca.destroy(power);
	}
}
