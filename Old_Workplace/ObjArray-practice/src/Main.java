import java.util.Scanner;

class Book {
	private String title, author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	void show() {
		System.out.println(title+" "+author);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Book [] book = new Book[10];
		int size = 0;
		String title = "", author = "";
		while(!title.equals("场")) {
			System.out.println("力格>");
			title = sc.nextLine();
			System.out.println("历磊>");
			author = sc.nextLine();
			book[size++] = new Book(title, author);
		}
		for(int i = 0; i < size-1; i++) {
			book[i].show();
		}
	sc.close();
	}

}
