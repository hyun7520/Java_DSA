import game.Castle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메세지 패싱 실습");
		Dragon Blue = new Dragon();
		
		// Blue.power = 10; 자료은닉: 데이터는 가능한 외부에 보이지 않게 (캡슐화)
		Blue.set(10);
		Blue.show();
		
		Castle North = new Castle(25); //패키지가 다르면 import 해줘야함
		North.show();
		
		Blue.fire(North); //메시지 패싱
		North.show();
	}

}
