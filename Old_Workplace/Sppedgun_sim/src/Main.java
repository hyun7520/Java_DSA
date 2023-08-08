
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
		for(int i = 1; i <= n; i++) { //목적지까지 각각의 도로와 스피드건을 지나간다. 
			// 도로생성
			Road road = new Road();
			// 스피드건 생성
			
			System.out.print("도로명 "+i+"\t 제한속도: "+road.getLimit()+"Km ");
			// 스피드건이 차의 속도를 얻어옴 : 메시지 패싱
			// 스피드건 monitor(): 위반여부 확인 메시지 패싱
			
			System.out.println("현재속도: "+sonata.current()+"Km");
		}
		
		
		/*
		Navigator iNavi = new Navigator();
		iNavi.find();
		iNavi.monitor();
		*/
	}

}
