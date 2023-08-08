import java.util.Random;
import java.util.Scanner;
public class Main {
	static void selectionSort(int[] v, int n) {
		for(int i = 0; i < n-1; i++) {
			//find minimun value index from i to n-1
			int min = i; 
			for(int j = i+1; j < n; j++) {
				if(v[j] < v[min]) min = j; { //같거나 같다로 할경우 데이터 중복 시 먼저 입력된 값이 먼저 처리 안됨
				}
				int t = v[i];
				v[i] = v[min];
				v[min] = t;
			}
		}
	}
	static void insertionSort(int[] v, int n) {
		for(int i = 1; i < n; i++) {
			int t = v[i], last = i - 1;
			while(last >= 0 && v[last] > t) {
				v[last + 1] = v[last];
				last--;
			}
			v[last+1] = t;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("기본정렬 구현 실습");
		Random rand = new Random(100); // 원래는 숫자 지정 x
		//100이 seed값이 됨, 항상 같은 값이 나옴
		//오류 발생 시 seed 값을 알면 오류를 찾기 쉽다.
		/*for(int i = 0; i < 10; i++) {
			System.out.println(rand.nextInt(1000000)); // 일정값이 반복
		}*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// make int array sized n
		int[] v = new int[n];
		//generate random values
		for(int i = 0; i < n; i++) {
			v[i] = rand.nextInt(1000000);
		}
		long ts = System.currentTimeMillis();
		//sorting
		
		//selectionSort(v, n);
		
		insertionSort(v, n);
		ts = System.currentTimeMillis() -ts;
		//data validation
		for(int i = 0; i < 10; i++) System.out.println(v[i]);
		//print elapsed time
		System.out.println("Elapsed time is "+ts+"ms.");
	}

}
