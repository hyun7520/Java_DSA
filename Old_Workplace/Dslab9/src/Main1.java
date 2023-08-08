import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
class Queue1 {
	
	int[][] data;
	int head, tail;
	Queue1() {
		data = new int[10][3];
		head = 0; tail = 10-1;
	}
	void add(int e, int j, int k) {
		data[tail][0]= e;
		data[tail][1]= j;
		data[tail][2]= k;
		tail = (tail+1) % 10;
	        //tail++는 0부터 n-1까지의 값을 자기기에 애매함
	}
	void remove() {
		 head = (head+1) % 10; //head 값은 항상 0에서 1까지
	}
	int[] peek() {
		return data[head];
	}
		
 }

public class Main1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue1 queue = new Queue1();
		while(true) {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int v = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int j =  Integer.parseInt(bf.readLine());
			if(j == -1) break;
			if(j == 0) {
				System.out.println(queue.peek());
				queue.remove();
			}
			else queue.add(v, s, k);
		}
	}
}