import game.Castle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�޼��� �н� �ǽ�");
		Dragon Blue = new Dragon();
		
		// Blue.power = 10; �ڷ�����: �����ʹ� ������ �ܺο� ������ �ʰ� (ĸ��ȭ)
		Blue.set(10);
		Blue.show();
		
		Castle North = new Castle(25); //��Ű���� �ٸ��� import �������
		North.show();
		
		Blue.fire(North); //�޽��� �н�
		North.show();
	}

}
