
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java API �ǽ�����");
		Quiz quiz = new Quiz();
		
		System.out.println("���Ѽӵ�= "+quiz.speed_limit()+"km");
		
		String source = "The old man and the sea";
		System.out.println(quiz.count(source, "he"));

	}

}
