package game;

public class Castle {
	private int strength;
	
	// 생성자 오버로딩
	public Castle(int st){ // public을 써줘야 다른 패키지 사용가능
		strength = st;
	}
	
	public void show() {  // public을 써줘야 다른 패키지 사용가능
		System.out.println("현재 내구력: "+strength);
	}

	public void destroy(int att) {  // 호출
		strength -= att;
		if(strength < 0) {
			System.out.println("성이 부서졌습니다.");
		}
	}
}
