package game;

public class Castle {
	private int strength;
	public Castle(int st) {
		strength = st;
	}
	public void show() {
		System.out.println("���� ������ "+strength);
	}
	public void destroy(int att) {
		strength -= att;
		if(strength < 0) {
			System.out.println("���� �μ�����");
		}
	}
}
