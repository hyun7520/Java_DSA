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
		System.out.println("성함: "+name+", 날짜: "+date+", 코스: "+course+", 인원: "+people);
	}
}


public class Main {

	public static void main(String[] args) {
		System.out.println("국립공원 예약시스템입니다.\n원하시는 메뉴를 선택하세요" );
		System.out.println("1. 예약\n2. 조회\n3. 종료");
		
		Scanner sc = new Scanner(System.in);
		int menu = -1, order = 0;
		Reserve[] reserve = new Reserve[70];

		while(menu != 0) {
			System.out.print("->");
			menu = sc.nextInt();
			switch(menu) {
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			case 1:
				System.out.print("1일부터 3일 까지 날짜를 입력해주세요. ->");
				int date = sc.nextInt();
				System.out.print("대표자 성함을 입력해주세요. ->");
				String name = sc.next();
				System.out.print("코스를 입력해주세요.");
				System.out.print("\n1. 지리산 칠선계곡\n2. 설악산 곰베골\n3. 경주 암곡\n->");
				int course = sc.nextInt();
				Corona.show(date);
				System.out.print("인원을 입력해주세요.\n3단계 조치일 경우 5인 이상 예약 불가능합니다.->");
				int people = sc.nextInt();
				if(Check.check_course(date, course, people) + Check.check_people(date, people) == 2) {
					reserve[++order] = new Reserve(name, date, course, people);
					System.out.println("예약이 완료되었습니다.");
					}
				else if(Corona.Date(date) == -1) System.out.println("잘못된 날짜입니다.");
				else if(Check.check_course(date, course, people) == -3) System.out.println("해당 코스는 만석입니다.");
				else if(Check.check_course(date, course, people) == -1) System.out.println("잘못된 코스 입니다.");
				else if(Check.check_people(date, people) == -1) {
					System.out.println("방역조치로 5인 이상은 예약 불가능합니다.");
					}
				break;
			case 2:
				for(int i = 1; i <= order; i++) reserve[i].show();
				break;
			default:
				System.out.println("다시 입력해주세요.");
				System.out.println("국립공원 예약시스템입니다.\n원하시는 메뉴를 선택하세요");
				System.out.println("1. 예약\n2. 조회\n3. 종료");
			}	
		}
		sc.close();
	}
}
