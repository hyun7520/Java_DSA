
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("스피드건 모의실험");
		
		Car sonata = new Car();
		System.out.println("최고속도: "+sonata.getHighest()+"Km");
		System.out.println("현재속도: "+sonata.current()+"Km");
		
		int n = sonata.Navi.find(); // n번만큼 도로를 지나감
		sonata.Navi.monitor();
		
		//simulation
		for(int i = 1; i <= n; i++) { 
			
			Road road = new Road();
			Speedgun sgun = new Speedgun();
			
			System.out.print("도로명 "+i+" ");
			
			
			sgun.shot(sonata);
			sgun.monitor(road);
		}
	}
}
