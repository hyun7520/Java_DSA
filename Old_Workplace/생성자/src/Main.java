class Book {
	String title;
	String author;
	
	Book() {}
	 
	//생성자
	Book(String t) {
		title = t; author = "작자미상";
	}
	
	//생성자 오버로딩
	Book(String t, String a) {
		title = t;
		author = a;
	}
	
	//기본 생성자 = default 생성장
	//Book(){}
	
	void show() {
		System.out.println("채제목: "+title+ ", 저자" +author);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("생성자 실습");
		
		Book mybook = new Book();
		
		mybook.title = "어린왕자";
		
		System.out.println(mybook.title);

	}

}
