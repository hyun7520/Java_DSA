
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ǵ�� ���ǽ���");
		
		Car sonata = new Car();
		System.out.println("�ְ�ӵ�: "+sonata.getHighest()+"Km");
		System.out.println("����ӵ�: "+sonata.current()+"Km");
		
		int n = sonata.Navi.find(); // n����ŭ ���θ� ������
		sonata.Navi.monitor();
		
		//simulation
		for(int i = 1; i <= n; i++) { 
			
			Road road = new Road();
			Speedgun sgun = new Speedgun();
			
			System.out.print("���θ� "+i+" ");
			
			
			sgun.shot(sonata);
			sgun.monitor(road);
		}
	}
}
