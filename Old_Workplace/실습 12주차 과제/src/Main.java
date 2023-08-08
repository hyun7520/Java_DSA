
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Animal Class");
		Animal Tiger = new Animal("Åä³¢");
		System.out.println("¸ÔÀº °Í: "+Tiger.get_feed());
		
		System.out.println("\n2. Fish Class");
		Fish Shark = new Fish("ÂüÄ¡", 30);
		Shark.show();

	}

}
