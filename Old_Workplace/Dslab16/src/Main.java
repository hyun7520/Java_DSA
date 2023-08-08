import java.util.Scanner;
import java.util.Random;

public class Main {
	static long histogram(int[] v, int from, int to) {
		long max = 0;
		for(int i = from; i<= to; i++) {
			int min = v[i];
			for(int j = i+1; j <= to; j ++) {
				if(v[j] < min) min = v[j];
				long s/*면적*/ =(long)min/*세로 길이*/*(j-i+1)/*i에서 j까지의 밑면 길이(가로)*/;
				if(s > max) max = s;
			}
		}
		return max;
	}
	static long histogram(int[] v, int n) {
		return histogram(v, 0, n-1);
	}
	static long dchistogram(int[] v, int n) {
		return dchistogram(v, 0, n-1);
	}
	static long dchistogram(int[] v, int from, int to) {
		if(from == to) return v[from];
		int c = (from+to)/2; //
		long a = dchistogram(v, from, c); // 2번 호출
		long b = dchistogram(v, c+1, to); //T(n) = 2T(2/n)
		long max = (a>b)?a:b;
		long min = (v[c]<v[c+1])? v[c]:v[c+1];
		if(max < min*2) max = min*2;
		int i = c-1, j = c+2;
		while(i >= from && j <= to) {  //+ O(n)
			if(v[i] > v[j]) {
				if(v[i]<min) min = v[i];
				i--;
			}
			else {
				if(v[j]<min) min = v[j];
				j++;
			}
			if(max<min*(j-i-1)) max = min*(j-i-1); 
		}
		while(i >= from) {
			if(v[i]<min) min = v[i];
			i--;
			if(max<min*(j-i-1)) max = min*(j-i-1);
		}
		while(j <= to) {
			if(v[j]<min) min = v[j];
			j++;
			if(max<min*(j-i-1)) max = min*(j-i-1);
		}
		return max;
	}
	
	//T(n) = O(NlogN)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(100);//100일 경우 입력 5 출력 1748
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i = 0; i< n; i++) v[i] = rand.nextInt(1000);
		long ts = System.currentTimeMillis();
		long r = dchistogram(v, n);
		ts = System.currentTimeMillis() - ts;
		for(int i = 0; i < 10 && i < n; i++) System.out.println(v[i]);
		System.out.println("result is "+r+" "+ts+"ms");
	}

}
