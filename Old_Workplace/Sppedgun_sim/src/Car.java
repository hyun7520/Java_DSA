
class Car {
	private int highest;
	Navigator Navi;
	Car() {
		highest = 140 + 10*(int)(Math.random()*8);
		Navi = new Navigator();
	}
	int current() {
		return (int)(Math.random()*highest);
	}
	int getHighest() {
		return highest;
	}
}
