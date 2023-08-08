import java.util.Scanner;

public class Main {
	
	static int findMin(int[] v, int from, int to) {
		int min = v[0];
		for(int i= from; i < to; i++) {
			if(min > v[i]) min = v[i];
		}
		return min;

	} 
	static int findMax(int[] v, int from, int to) {
		int max = v[0];
		for(int i = from; i < to; i++) {
			if(max < v[i]) max = v[i];
		}	
		return max;
	}
	
	static int findMin(int[] v, int n) {
		return findMin(v, 0, n);
	}
	static int findMax(int[] v, int n) {
		return findMax(v, 0, n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		int min = findMin(v, n);
		int max = findMax(v, n);
		
		System.out.println(min+" "+max);
		
		sc.close();
	}

}
