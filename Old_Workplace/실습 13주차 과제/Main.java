
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java API 실습과제");
		Quiz quiz = new Quiz();
		
		System.out.println("제한속도= "+quiz.speed_limit()+"km");
		
		String source = "The old man and the sea";
		System.out.println(quiz.count(source, "he"));

	}

}
