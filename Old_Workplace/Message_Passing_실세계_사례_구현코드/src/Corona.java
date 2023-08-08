import java.util.Random;

public class Corona {
		
	private static Random ran = new Random();
	private static int limit1 = ran.nextInt(3), limit2 = ran.nextInt(3), limit3 =ran.nextInt(3);
	private int date, people;

	Corona(int date, int people) {
		super();
		this.date = date;
		this.people = people;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public static int Date(int date) {
		if(date == 1) return limit1;
		if(date == 2) return limit2;
		if(date == 3) return limit3;
		else return -1;
	}
		
	public static int corona(int date, int people) {
		if(date == 1) if(limit1 == 3 && people > 4) return -1;
		else if(date == 2) if(limit2 == 3 && people > 4) return -1;
		else if(date == 3) if(limit3 == 3 && people > 4) return -1;
		return 1;
	
	}
	public static void show(int date) {
		if(date == 1) System.out.println("현재 방역 단계는 "+limit1+"단계 입니다");
		if(date == 2) System.out.println("현재 방역 단계는 "+limit2+"단계 입니다");
		if(date == 3) System.out.println("현재 방역 단계는 "+limit3+"단계 입니다");
	}

}
