
public class Fish extends Animal {
	private int depth;

	Fish(String fd, int dt) {
		super(fd);
		depth = dt;
	}
	void show() {
		System.out.println("���� ��: "+get_feed()+", ���� ���� "+depth+"m");
	}
	
	

}
