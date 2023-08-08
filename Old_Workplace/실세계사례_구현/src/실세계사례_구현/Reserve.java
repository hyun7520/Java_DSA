package 실세계사례_구현;

public class Reserve {

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
	
	
}	