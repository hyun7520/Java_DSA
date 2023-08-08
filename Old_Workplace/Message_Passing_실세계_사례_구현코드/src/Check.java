
public class Check {
	private static int [][] course_1 = new int[1][20];
	private static int [][] course_2 = new int[1][30];
	private static int [][] course_3 = new int[1][10];
	private static int Return;
	private int date, course, people;

	Check(int date, int course, int people) {
		this.date = date;
		this.course = course;
		this.people = people;
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

	public static int check_course(int date, int course, int people) {
		switch (date) {
		case 1:
			switch(course) {
			case 1:
				for(int i = 0; i < 20; i++) {
					if(course_1[0][19] == 1) Return = -3;
					else {
						for(int j = 0; j < people; j++) course_1[0][i] = 1;
						Return = 1;
					}
					
				}
				break;
			case 2:
				for(int i = 0; i < 30; i++) {
					if(course_2[0][29] == 1) Return = -3;
					else {
						for(int j = 0; j < people; j++) course_2[0][i] = 1;
						Return = 1;
					}
				}
				break;
			case 3:
				for(int i = 0; i < 10; i++) {
					if(course_3[0][9] == 1) Return = -3;
					else {
						for(int j = 0; j < people; j++) course_3[0][i] = 1;
						Return = 1;
					}	
				}
				break;
			}
			break;
		case 2:
			switch(course) {
			case 1:
				for(int i = 0; i < 20; i++) {
					if(course_1[0][19] == 1) Return = -3;
					else {
						for(int j = 0; j < people; j++) course_1[0][i] = 1;
						Return = 1;
					}
				}
				break;
			case 2:
				for(int i = 0; i < 30; i++) {
					if(course_2[0][29] == 1) Return = -3;
					else {
						for(int j = 0; j < people; j++) course_2[0][i] = 1;
						Return = 1;
					}
				}
				break;
			case 3:
				for(int i = 0; i < 10; i++) {
					if(course_3[0][9] == 1) Return = -3;
					else {
						for(int j = 0; j < people; j++) course_3[0][i] = 1;
						Return = 1;
					}	
				}
				break;
			}
			break;
		case 3:	
			switch(course) {
			case 1:
				for(int i = 0; i < 20; i++) {
					if(course_1[0][19] == 1) Return = -3;
					else {
						for(int j = 0; j < people; j++) course_1[0][i] = 1;
						Return = 1;
					}
				}
				break;
			case 2:
				for(int i = 0; i < 30; i++) {
					if(course_2[0][29] == 1) Return = -3;
					else {
						for(int j = 0; j < people; j++) course_2[0][i] = 1;
						Return = 1;
					}
				}
				break;
			case 3:
				for(int i = 0; i < 10; i++) {
					if(course_3[0][9] == 1) Return = -3;
					else {
						for(int j = 0; j < people; j++) course_3[0][i] = 1;
						Return = 1;
					}	
				}
				break;
			}
			break;
		default:
			Return = -1;
		}	
		return Return;	
	}
	
	public static int check_people(int date, int people) {
		return Corona.corona(date, people);
	}
}
