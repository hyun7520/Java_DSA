import game.Castle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�޼��� �н� �ǽ�");
		Dragon Blue = new Dragon();
		
		Blue.set(10);
		Blue.show();
		
		Castle North = new Castle(25);
		North.show();
		
		Blue.fire(North);
		Blue.fire(North);
		Blue.fire(North);
		North.show();

	}

}
