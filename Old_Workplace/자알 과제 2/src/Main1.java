import java.util.Scanner;

public class Main1 {
	
	static String[] t;
	static void mergesort(String[] string, int from, int to) {
		if(from == to) return;
		int mid = (from+to)/2;
		mergesort(string, from, mid);
		mergesort(string, mid+1, to);
		int i = from, j = mid+1, k = from;
		while(i <= mid && j <= to) {
			if(string[i].compareTo(string[j]) < 0) {
				t[k++] = string[i++];
			}
			else t[k++] = string[j++];
		}
		while(i <= mid) t[k++] = string[i++];
		while(j <= to) t[k++] = string[j++];
		for(i = from; i<= to; i++) string[i] = t[i];
	}
	static void mergesort(String[] a, int size) {
		t = new String[size];
		mergesort(a, 0, size-1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] arr = new String[size];
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		mergesort(arr, arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	
		sc.close();
	}
}
