
public class Main {

	public static void main(String[] args) { //static이면
		// TODO Auto-generated method stub
		
		int n = 10;
		
		//method: class 소속
		//n++;  
		//메소드 호출문
		n = increase(n);   //콤파일 시 int m = n 이라고 인식
		//반환된 m값을 n에 저장한다.
		
		System.out.println(n);
		
	}
	
	//method
	static int increase(int m) {  //m은 메소드 내의 지역변수
		//여기서도 static 이어야 작동한다.
		
		m++;
		
		return m;  //m을 반환시켜준다
	}

}
