
class Speedgun {
	
	private int theSpeed;
	private void ticketing(int limit) {
		if(theSpeed > limit) {
			System.out.println("\t*ticked by "+(theSpeed-limit)+"Km");
		}
	}
	void shot(Car car) {  // ���ǵ���� ���� �ӵ��� ������ �޽��� �н�
		theSpeed = car.current();
		
	}
	void monitor(Road road) {
		int limit = road.getLimit();
		System.out.println("current speed: "+theSpeed+"Km\t");
		System.out.println("speed limit: "+limit+"Km\t");
		ticketing(limit);
	}
}
