//요세푸스 문제
import java.util.Scanner;
public class Main {
	static void printJosepus(int n, int k) { //O(nk) 알고리즘
		// while queue is not empty
		// - for k-1
		// -- deque one number from queue
		// -- enque the number into queue
		// - deque one number from queue 
		// print the number
		
		// 사이즈가 n+1인 큐 생성
		int size = n+1;
		int[] queue = new int[size];
		int head = 0, tail = 0;
		// 1부터 n까지 숫자 입력
		for(int i = 1; i<=n; i++) queue[tail++] = i;
		while(head != tail) { //같은 경우 비어있음
		//for(int s = 0; s < n; s++ ) {
			for(int i = 0; i < k-1; i ++) {
				// 숫자를 가져오고 제거
				int v = queue[head];
				head = (head+1)%size;
				// 숫자를 큐 안에 넣는다
				queue[tail] = v;
				tail =(tail+1)%size;
			}
			int v = queue[head];
			head = (head+1)%size;
			System.out.println(v);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		printJosepus(n, k);
	}
}
