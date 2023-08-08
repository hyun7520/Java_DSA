import java.util.Random;
import java.util.Scanner;

public class Main {
	static void selectionSort(int[] v, int from, int to) {
		for(int i = from; i < to; i++) {
			int min = i;
			for(int j = i+1; j <= to; j++) {
				if(v[j] < v[min]) min = j; 
			}
				int t = v[min];
				v[min] = v[i];
				v[i] = t;
			}
		}
		static void selectionSort(int[] v, int n) {
			selectionSort(v, 0 , n-1);
		}
		static int[] t;
		static void mergeSort(int[] v, int from, int to) {
			if(from == to) return; // 탈출조건
			int c = (from+to)/2;
			mergeSort(v, from, c);
			mergeSort(v, c+1, to); // 재귀 쓸때는 탈출조건 초기조건 필요
			int i = from, j = c+1, k = from;
			// int[] t = new int[to+1];
			while(i <= c && j <= to) {
				if(v[i] <= v[j]) t[k++] = v[i++];
				else t[k++] = v[j++];
			}
			while(i <= c) {
				t[k++] = v[i++];
			}
			while(j <= to) {
				t[k++] = v[j++];
			}
			for(i = from; i <= to; i++) v[i] = t[i];
		}
		static void mergeSort(int[] v, int n) {
			t = new int[n];
			mergeSort(v, 0 , n-1);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random(100);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] v = new int[n];
		for(int i = 0; i < n; i++) {
			v[i] = rand.nextInt(1000000);
		}
		long ts = System.currentTimeMillis();
		//sorting
		mergeSort(v, n);
		ts = System.currentTimeMillis() - ts;
		//test out
		for(int i = 0; i < 10; i++) {
			System.out.println(v[i]);
		}
		System.out.println("elapsed time"+ts+"ms");

	}

}
