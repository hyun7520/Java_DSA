
public class Fish extends Animal {
	private int depth;

	Fish(String fd, int dt) {
		super(fd);
		depth = dt;
	}
	void show() {
		System.out.println("먹은 것: "+get_feed()+", 현재 수심 "+depth+"m");
	}
	
	

}
