
public class Main {

	public static void main(String[] args) { //static�̸�
		// TODO Auto-generated method stub
		
		int n = 10;
		
		//method: class �Ҽ�
		//n++;  
		//�޼ҵ� ȣ�⹮
		n = increase(n);   //������ �� int m = n �̶�� �ν�
		//��ȯ�� m���� n�� �����Ѵ�.
		
		System.out.println(n);
		
	}
	
	//method
	static int increase(int m) {  //m�� �޼ҵ� ���� ��������
		//���⼭�� static �̾�� �۵��Ѵ�.
		
		m++;
		
		return m;  //m�� ��ȯ�����ش�
	}

}
