class Book {
	String title;
	String author;
	
	Book() {}
	 
	//������
	Book(String t) {
		title = t; author = "���ڹ̻�";
	}
	
	//������ �����ε�
	Book(String t, String a) {
		title = t;
		author = a;
	}
	
	//�⺻ ������ = default ������
	//Book(){}
	
	void show() {
		System.out.println("ä����: "+title+ ", ����" +author);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �ǽ�");
		
		Book mybook = new Book();
		
		mybook.title = "�����";
		
		System.out.println(mybook.title);

	}

}
