package game;

public class Castle {
	private int strength;
	public Castle(int st) {
		strength = st;
	}
	public void show() {
		System.out.println("현재 내구력 "+strength);
	}
	public void destroy(int att) {
		strength -= att;
		if(strength < 0) {
			System.out.println("성이 부서졌다");
		}
	}
}
