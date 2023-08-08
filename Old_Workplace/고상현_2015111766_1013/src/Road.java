
class Road {
	private int limit;
	Road() { // 도로마다 제한속도 
		int a = (int)(Math.random()*4)+1;
		switch(a) {
		case 1:
			limit = 60;
			break;
		case 2:
			limit = 70;
			break;
		case 3:
			limit = 80;
			break;
		case 4:
			limit = 90;
			break;
		}
	}
	
	
	int getLimit() { // 스피드건이 호출
		return limit; 
	}
}
