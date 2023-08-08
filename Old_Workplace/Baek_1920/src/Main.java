import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer a, b;
		
		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int[N];
		a = new StringTokenizer(bf.readLine());
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(a.nextToken());
		}
		
		int M = Integer.parseInt(bf.readLine());
		int[] bos = new int[M];
		b = new StringTokenizer(bf.readLine());
		for(int i = 0; i < bos.length; i++) {
			bos[i] = Integer.parseInt(b.nextToken());
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <bos.length; j++) {
				check(arr[i, arr[j]]);
			}
		}
		
	}

}
