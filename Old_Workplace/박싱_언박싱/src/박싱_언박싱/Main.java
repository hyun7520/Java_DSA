package �ڽ�_��ڽ�;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strA = "30";
		String strB = "50";
		
		System.out.println(strA + strB); //3050
		int a = Integer.parseInt(strA); //parseInt()�� static�̱� ������ ��ü
		//�������� ȣ���Ҽ� �ִ�.
		int b = Integer.parseInt(strB);
		
		System.out.println(a + b);
		
		//boxing unboxing
		a = 10;
		Integer A = a; //�ڽ�
		
		System.out.println("String�ǽ�");
		
		String c = "  java\ttest";
		String d = new String(",Python");
		
		System.out.println(c);
		c = c.trim();
		System.out.println(c);
		
		c = c.substring(3);
		System.out.println(c);
		
		c= c.concat(d);
		System.out.println(c);
		
		System.out.println("Math�ǽ�: �ζ� ��ȣ �߻���(1~45)");
		
		for(int i = 0; i < 6; i ++) {
			System.out.println((int)(Math.random()*45+1)+" ");
		}
	}

}
