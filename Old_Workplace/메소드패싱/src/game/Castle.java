package game;

public class Castle {
	private int strength;
	
	// ������ �����ε�
	public Castle(int st){ // public�� ����� �ٸ� ��Ű�� ��밡��
		strength = st;
	}
	
	public void show() {  // public�� ����� �ٸ� ��Ű�� ��밡��
		System.out.println("���� ������: "+strength);
	}

	public void destroy(int att) {  // ȣ��
		strength -= att;
		if(strength < 0) {
			System.out.println("���� �μ������ϴ�.");
		}
	}
}
