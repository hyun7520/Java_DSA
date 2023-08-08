import java.util.Scanner;

class Book{
	private String title, author;  //private�̱⿡ oldman.title = "���ΰ� �ٴ�"; �̷��� ���� ���� ����
	
	// ���� �����ϱ� ���� �޼ҵ� �ʿ� = ����
	/*void set(String t) {
		title = t; 
	}*/
	
	//����Ʈ �����ڸ� ����� ��� ������ ����
	//Book(){}
	
	// source�� ����� ������ �����ε�
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// source -> generate getter and setter�� ���� ������ִ�
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
		
		Book[] book = new Book[10]; // ��ü ���۷��� ������ �迭
		
		int size = 0;
		String title = "", author = "";
		Scanner sc = new Scanner(System.in);
		
		while( !title.equals("��") ) { // ������ �� �� ��� ���� but title != "��" ����
			System.out.print("����> ");
			title = sc.nextLine();
			System.out.print("����> ");
			author = sc.nextLine();
			book[size++] = new Book(title, author);
		}
		
		for(int i = 0; i < size - 1; i++) { // ������ ���� �� �̹Ƿ� �װ��� �����ϱ� ���� size-1
			book[i].show();
			
		}
		
		
		
		sc.close();
		
		
		/*
		Book oldman = new Book("���ΰ� �ٴ�", "��ֿ���");
		
		//oldman.setTitle("���ΰ� �ٴ�"); // ���ڰ� ������ null ���� ���
		
		oldman.show();
		*/
		
		
	}

}
