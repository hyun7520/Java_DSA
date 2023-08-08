package 박싱_언박싱;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strA = "30";
		String strB = "50";
		
		System.out.println(strA + strB); //3050
		int a = Integer.parseInt(strA); //parseInt()가 static이기 때문에 객체
		//생성없이 호출할수 있다.
		int b = Integer.parseInt(strB);
		
		System.out.println(a + b);
		
		//boxing unboxing
		a = 10;
		Integer A = a; //박싱
		
		System.out.println("String실습");
		
		String c = "  java\ttest";
		String d = new String(",Python");
		
		System.out.println(c);
		c = c.trim();
		System.out.println(c);
		
		c = c.substring(3);
		System.out.println(c);
		
		c= c.concat(d);
		System.out.println(c);
		
		System.out.println("Math실습: 로또 번호 발생기(1~45)");
		
		for(int i = 0; i < 6; i ++) {
			System.out.println((int)(Math.random()*45+1)+" ");
		}
	}

}
