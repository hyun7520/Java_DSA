import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringTokenizer sr;
		String yn;
		
		menu();
		
		Order ord = new Order();
		
		while(true) {
			int N = Integer.parseInt(bf.readLine());
			
			switch(N) {
			case 1:
				System.out.println("�ֹ� �Է�{����(1~5) �Ÿ�(�⺻�ִ� ���緮 = 50) ����}: ");
				st = new StringTokenizer(bf.readLine());
				int district = Integer.parseInt(st.nextToken());
				int Km = Integer.parseInt(st.nextToken());
				int weight = Integer.parseInt(st.nextToken());
				System.out.println("�ֹ� Ȯ�� ->\n" + "����: " + district + " �Ÿ�: " + Km + " ����: " + weight);
				ord.Drone_ability(Km, weight);
				System.out.println("�ֹ��� �����Ͻðڽ��ϱ�? -> Y/N");
				yn = bf.readLine();
				if(yn.equals("Y") || yn.equals("y")) {
					System.out.println("�ֹ��� �����մϴ�");
					System.out.println("���� ���� Ȯ����...");
					ord.confirm(district, Km, weight);
				}
				if(yn.equals("N") || yn.equals("n")) {
					System.out.println("�޴��� ���ư��ϴ�");
					menu();
				}
				break;
			case 2:
				if(ord.check_order().equals("empty")) {
					System.out.println("�������� �ֹ��� �����ϴ�!");
					System.out.println("�޴��� ���ư��ϴ�.");
					menu();
				}
				else if(ord.check_order().equals("check")) {
					ord.show();
					System.out.println("���ο� ������� ���ֹ��� �õ��Ͻðڽ��ϱ�? Y/N");
					yn = bf.readLine();
					if(yn.equals("Y") || yn.equals("y")) {
						System.out.println("���ֹ��� �õ��� �ֹ� ��ȣ�� �Է����ֽʽÿ�");
						int n = Integer.parseInt(bf.readLine());
						Drone drone = new Drone();
						System.out.println("���Ӱ� ������ ����� ������ �Է��Ͻʽÿ�.");
						System.out.println("���͸� �����緯 ����뷮 (�⺻ = 100, 1, 50)"+ "->");
						sr = new StringTokenizer(bf.readLine());
						int new_bat = drone.part.change_bat(Integer.parseInt(sr.nextToken()));
						double new_prop = drone.part.change_prop(Double.parseDouble(sr.nextToken()));
						double new_load = drone.part.change_load(Double.parseDouble(sr.nextToken()));
						ord.re_confirm(n, new_bat, new_prop, new_load);
					}
					if(yn.equals("N") || yn.equals("n")) {
						System.out.println("�޴��� ���ư��ϴ�");
						menu();
					}
				}
				break;
			case 3:
				System.out.println("���� ��ȣ �Է�(1~5): ");
				int dist_no = Integer.parseInt(bf.readLine());
				System.out.print("�ش� ������ ������: ");
				ord.get_weather(dist_no);
				break;
				
			case 4:
				System.out.println("���� ��ȣ �Է�(1~5): ");
				dist_no = Integer.parseInt(bf.readLine());
				System.out.print("������ ��� ���� 70�� �̻��� ��� ����� �Ұ����մϴ�. ���� ��м�: ");
				ord.cnt_Drone_count(dist_no);
				break;
				
			case 5:
				menu();
				break;
				
			case 0:
				System.out.println("�ý��� ����");
				System.exit(0);
			}
		}
		
	}
	static void menu() {
		System.out.println("��� �ֹ�");
		System.out.println("1. ���� �Է�");
		System.out.println("2. ������ �ֹ� Ȯ��");
		System.out.println("3. ��� ��Ȳ");
		System.out.println("4. ������ ��� ��Ȳ");
		System.out.println("5. �޴� �����");
		System.out.println("0. �ý��� ����");
	}

}
