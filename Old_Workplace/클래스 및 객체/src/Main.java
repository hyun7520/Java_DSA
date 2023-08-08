
//클래스를 정의
class Circle {
	//속성
	int radius; 
	String name; //필드
	
	//메소드
	void area() {
		System.out.println("면적: "+ radius*radius*3.14); //클래스에 해당하는 필드는 메소드에서 마음대로 쓸 수 있다.
	}
	
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("클래스 및 객체");
		Circle pizza; //레퍼런스 선언
		pizza = new Circle(); //객체 생성 -> 저장공간 
		
		pizza.radius = 20;
		pizza.name = "홍길동";
		
		System.out.println(pizza.radius + " " + pizza.name);
		
		pizza.area(); //메소드 호츌
		
		//결과값이 .0 인 이유는 자동 타입변환 때문이다

	}

}
