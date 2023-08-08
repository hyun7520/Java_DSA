import java.util.Scanner;
class Queue {
	int N = 100;
	int[] data;
	int head, tail;
	Queue() {
		data = new int[N];
		head = 0; tail = N-1;
	}
	void add(int e) {
		data[tail] = e;
		tail = (tail+1) % N;
	        //tail++�� 0���� n-1������ ���� �ڱ�⿡ �ָ���
	}
	void remove() {
		 head = (head+1) % N; //head ���� �׻� 0���� 1����
	}
	int peek() {
		return data[head];
	}
		
 }

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue queue = new Queue();
		while(true) {
			int v = sc.nextInt();
			if(v == -1) break;
			if(v == 0) {
				System.out.println(queue.peek());
				queue.remove();
			}
			else queue.add(v);
		}
	}
}
