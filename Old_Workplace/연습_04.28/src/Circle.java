
public class Circle {
	int radius;
	void set(int r) {
		radius = r;
	}
	double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle();
		pizza.set(3);
		
	}

}
