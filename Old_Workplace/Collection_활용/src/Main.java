import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		System.out.println("제네릭 & 컬렉션 실습");
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(5);
		arr.add(4);
		arr.add(-1);
		
		arr.add(1, 100);
		
		Collections.sort(arr);
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
		
		ArrayList<String> srr = new ArrayList<>();
		srr.add("orange");
		srr.add("kiwi");
		srr.add("banana");
		
		Collections.sort(srr);
		
		show(srr);

	}
	static void show(ArrayList<String> a) {
		for(int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i)+" ");
		}
		System.out.println();
	}

}
