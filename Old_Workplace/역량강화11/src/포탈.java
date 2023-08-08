import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Æ÷Å» {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		
		int[] visit = new int[100001];
		boolean same = true;
		Queue<Integer> arr= new LinkedList<>();
		arr.add(X);
		
		while(!arr.isEmpty()) {
			int temp = arr.poll();
			if(X == Y) {
				same = false;
				break;
			}
			if(temp + 1 <= 100000 && visit[temp+1] == 0) {
				visit[temp+1] = visit[temp] + 1;
				arr.offer(temp+1);
			}
			if(temp - 1 >=0 && visit[temp-1] == 0) {
				visit[temp-1] = visit[temp] + 1;
				arr.offer(temp-1);
			}
			if(temp*2 <= 100000 && visit[temp*2] == 0) {
				visit[temp*2] = visit[temp] + 1;
				arr.offer(temp*2);
			}
		}
		if(!same) System.out.println(0);
		else System.out.println(visit[Y]);
	}
}
