import game.Castle;

class Dragon {
	private int power; //캡슐화 위해 private로 앞으로 모든 필드 계속 private
	void set(int po) {
		power = po;
	}
	void show() {
		System.out.println("현재파워 "+ power);
	}
	void fire(Castle ca) {
		ca.destroy(power);
	}
}
