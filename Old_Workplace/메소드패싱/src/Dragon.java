import game.Castle;

class Dragon {
	private int power;
	
	void set(int po) { // setter
		power = po;
	}
	void show() {
		System.out.println("현재 파워: "+power);
		
	}
	void fire(Castle ca) { //객체 인자 전달
		ca.destroy(power); //메시지 패싱
	}
}
