//�似Ǫ�� ����
import java.util.Scanner;
public class Main {
	static void printJosepus(int n, int k) { //O(nk) �˰���
		// while queue is not empty
		// - for k-1
		// -- deque one number from queue
		// -- enque the number into queue
		// - deque one number from queue 
		// print the number
		
		// ����� n+1�� ť ����
		int size = n+1;
		int[] queue = new int[size];
		int head = 0, tail = 0;
		// 1���� n���� ���� �Է�
		for(int i = 1; i<=n; i++) queue[tail++] = i;
		while(head != tail) { //���� ��� �������
		//for(int s = 0; s < n; s++ ) {
			for(int i = 0; i < k-1; i ++) {
				// ���ڸ� �������� ����
				int v = queue[head];
				head = (head+1)%size;
				// ���ڸ� ť �ȿ� �ִ´�
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
