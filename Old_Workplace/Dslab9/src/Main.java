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
	        //tail++는 0부터 n-1까지의 값을 자기기에 애매함
	}
	void remove() {
		 head = (head+1) % N; //head 값은 항상 0에서 1까지
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
