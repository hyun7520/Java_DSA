class Example {
	int a;
	int b;
	
	public boolean odd(int a) {
		if(a % 2 == 0) {
			return true;
		}
		else return false;
	}
	
	public int min(int[] dat) {
		int min = dat[0];
		for(int i = 0; i < dat.length; i++) {
			if(dat[i] < min) {
				min = dat[i];
			}
		}
		return min;
	}	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex = new Example();
		int temp = 0;
		
		int a = 5;
		System.out.print("1번문제 = ");
		if(ex.odd(a))
			System.out.println("홀수");
		else
			System.out.println("짝수");
		
		
		char c = 's';
		c = next(c);
		System.out.println("2번문제 = " + c);
		
		int[] data = {10,5,8,20,7,3,30,25,15};
		System.out.println("3번문제 = "+ ex.min(data));

	}
	
	static char next(char ch) {
		return (char)(ch + 1);
	}
}
