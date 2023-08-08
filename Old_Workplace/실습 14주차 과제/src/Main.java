class ArrList<E> {
	private int size;
	private E[] a;
	
	ArrList() {
		size = 0;
		a = (E[]) new Object[50];
	
	}
	void add(E data) {
		a[size++] = data;
	}
	int size() {
		return size;
	}
	void add(int s, E data) {
		for(int i = size; i > s; i--) {
			a[i] = a[i-1];
		}
		a[s] = data;
		size++;
	}
	void show() {
		for(int i = 0; i < size; i ++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	E get(int i) {
		return a[i];
	}
	void remove(int r) {
		for(int i = r; i < size; i++) {
			a[i] = a[i + 1];
		}
		size--;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ArrList<E> 클래스 설계");
		ArrList<Integer> arr= new ArrList<Integer>();
		
		arr.add(5);
		arr.add(4);
		arr.add(-1);
		
		System.out.println("ArrList요소수: "+arr.size());
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println();
		
		arr.add(2, 100);
		arr.show();
		
		arr.remove(1);
		arr.show();

	}

}
