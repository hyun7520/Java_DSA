import java.util.Scanner;

class Car {
	int fuel;                 //자동차의 연료 필드
	int engine;               //자동차의 엔진 필드
	int material;             //자동차의 재질 필드
	String model;             //자동차의 모델명 필드
	
	public Car() {
		fuel = 0; engine = 0; material = 0; model = "";
	}
	
	public Car(int a, int b, int c, String n) {
		fuel = a; engine = b; material = c; model = n;
	}

	public int distance() {   //거리 계산 메소드
		return fuel*engine;
	}
	public int life() {       //자동차의 수명 계산 메소드
		return distance()/material;
	}
	
}

public class Main2 {

	public static void main(String[] args) {
		System.out.println("자동차의 클래스 및 객체");
		Scanner sc = new Scanner(System.in);
		Car goodcar = new Car(10, 20, 10, "좋은 자동차");
		
		int 거리 = goodcar.distance();
				
		Car badcar = new Car(5, 2, 2, "나쁜 자동차");
		
		goodcar.fuel = sc.nextInt();      //자동차의 연료값 입력
		goodcar.engine = sc.nextInt();    //자동차의 엔진값 입력
		goodcar.material = sc.nextInt();  //자동차의 재질 
		goodcar.model = "좋은 자동차";       //자동차의 모델명 입력
		
		System.out.println(goodcar.model + "는 최대 " + goodcar.distance() + "Km를 달릴수있고 " + goodcar.life() + "년 동안 사용할 수 있다.");
		sc.close();

	}

}
