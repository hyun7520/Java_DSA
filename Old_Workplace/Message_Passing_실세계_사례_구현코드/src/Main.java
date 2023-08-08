import java.util.Scanner;

class Reserve {
	private String name;
	private int date, course, people;
	
	Reserve(String name, int date, int course, int people) {
		this.name = name;
		this.date = date;
		this.course = course;
		this.people = people;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	void show() {
		System.out.println("����: "+name+", ��¥: "+date+", �ڽ�: "+course+", �ο�: "+people);
	}
}


public class Main {

	public static void main(String[] args) {
		System.out.println("�������� ����ý����Դϴ�.\n���Ͻô� �޴��� �����ϼ���" );
		System.out.println("1. ����\n2. ��ȸ\n3. ����");
		
		Scanner sc = new Scanner(System.in);
		int menu = -1, order = 0;
		Reserve[] reserve = new Reserve[70];

		while(menu != 0) {
			System.out.print("->");
			menu = sc.nextInt();
			switch(menu) {
			case 0:
				System.out.println("����Ǿ����ϴ�.");
				System.exit(0);
				break;
			case 1:
				System.out.print("1�Ϻ��� 3�� ���� ��¥�� �Է����ּ���. ->");
				int date = sc.nextInt();
				System.out.print("��ǥ�� ������ �Է����ּ���. ->");
				String name = sc.next();
				System.out.print("�ڽ��� �Է����ּ���.");
				System.out.print("\n1. ������ ĥ�����\n2. ���ǻ� ������\n3. ���� �ϰ�\n->");
				int course = sc.nextInt();
				Corona.show(date);
				System.out.print("�ο��� �Է����ּ���.\n3�ܰ� ��ġ�� ��� 5�� �̻� ���� �Ұ����մϴ�.->");
				int people = sc.nextInt();
				if(Check.check_course(date, course, people) + Check.check_people(date, people) == 2) {
					reserve[++order] = new Reserve(name, date, course, people);
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					}
				else if(Corona.Date(date) == -1) System.out.println("�߸��� ��¥�Դϴ�.");
				else if(Check.check_course(date, course, people) == -3) System.out.println("�ش� �ڽ��� �����Դϴ�.");
				else if(Check.check_course(date, course, people) == -1) System.out.println("�߸��� �ڽ� �Դϴ�.");
				else if(Check.check_people(date, people) == -1) {
					System.out.println("�濪��ġ�� 5�� �̻��� ���� �Ұ����մϴ�.");
					}
				break;
			case 2:
				for(int i = 1; i <= order; i++) reserve[i].show();
				break;
			default:
				System.out.println("�ٽ� �Է����ּ���.");
				System.out.println("�������� ����ý����Դϴ�.\n���Ͻô� �޴��� �����ϼ���");
				System.out.println("1. ����\n2. ��ȸ\n3. ����");
			}	
		}
		sc.close();
	}
}
