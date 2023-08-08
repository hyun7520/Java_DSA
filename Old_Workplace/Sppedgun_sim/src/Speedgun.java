
class Speedgun {
	
	private int theSpeed;
	void shot(Car car) {  // 스피드건이 차의 속도를 얻어오는 메시지 패싱
		theSpeed = car.current();
	}

}
