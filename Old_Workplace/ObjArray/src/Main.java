import java.util.Scanner;

class Book{
	private String title, author;  //private이기에 oldman.title = "노인과 바다"; 이렇게 값을 넣지 못함
	
	// 값을 설정하기 위한 메소드 필요 = 세터
	/*void set(String t) {
		title = t; 
	}*/
	
	//디폴트 생성자를 만들어 줘야 에러가 없다
	//Book(){}
	
	// source를 사용한 생성자 오버로딩
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// source -> generate getter and setter로 쉽게 만들수있다
	void show() {
		System.out.println(title+" "+author);
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}

public class Main {

	public static void main(String[] args) {  // Entry point
		// TODO Auto-generated method stub
		
		Book[] book = new Book[10]; // 객체 레퍼런스 변수의 배열
		
		int size = 0;
		String title = "", author = "";
		Scanner sc = new Scanner(System.in);
		
		while( !title.equals("끝") ) { // 제목이 끝 일 경우 종료 but title != "끝" 오류
			System.out.print("제목> ");
			title = sc.nextLine();
			System.out.print("저자> ");
			author = sc.nextLine();
			book[size++] = new Book(title, author);
		}
		
		for(int i = 0; i < size - 1; i++) { // 마지막 값이 끝 이므로 그것은 생략하기 위해 size-1
			book[i].show();
			
		}
		
		
		
		sc.close();
		
		
		/*
		Book oldman = new Book("노인과 바다", "헤밍웨이");
		
		//oldman.setTitle("노인과 바다"); // 저자가 없으니 null 값이 출력
		
		oldman.show();
		*/
		
		
	}

}
