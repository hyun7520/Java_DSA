
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
		for(int i = 1; i <= n; i++) { //���������� ������ ���ο� ���ǵ���� ��������. 
			// ���λ���
			Road road = new Road();
			// ���ǵ�� ����
			
			System.out.print("���θ� "+i+"\t ���Ѽӵ�: "+road.getLimit()+"Km ");
			// ���ǵ���� ���� �ӵ��� ���� : �޽��� �н�
			// ���ǵ�� monitor(): ���ݿ��� Ȯ�� �޽��� �н�
			
			System.out.println("����ӵ�: "+sonata.current()+"Km");
		}
		
		
		/*
		Navigator iNavi = new Navigator();
		iNavi.find();
		iNavi.monitor();
		*/
	}

}
