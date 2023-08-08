import java.util.Collections;

// 배열리스트
class Arrlist<E> { // 제네릭 <E>
	// Field
	private int sz;// size
	private E[] a;
	
	// Method
	Arrlist() {
		sz = 0;
		a = (E[]) new Object[50];
	}
	void add(E data) {
		a[sz++] = data;
	}
	int size() {
		return sz;
	}
	E get(int pos) {
		return a[pos];
	}
	void show() {
		for(int i = 0; i < sz; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrlist<Integer> arr = new Arrlist<>();
		arr.add(5);
		arr.add(4);
		arr.add(-1);
		
		arr.show();

	}

}
