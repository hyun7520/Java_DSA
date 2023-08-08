import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class tomatoMain {
	
    public static void main(String[] args) throws IOException {
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(bf.readLine());
       
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
       int[][] arr = new int[N][M];
       int[] dx = {0, 0, 1, -1};
   	   int[] dy = {1, -1, 0, 0};
       Queue<Integer[]> start = new LinkedList<>();
              
       for(int i = 0; i < N; i++) {
    	   st = new StringTokenizer(bf.readLine());
    	   for(int j = 0; j < M; j++) {
    		   int temp = Integer.parseInt(st.nextToken());
    		   if(temp == 1) {
    			   start.add(new Integer[] {i, j});
    			   arr[i][j] = 1;
    		   }
    		   if(temp == 0 || temp == -1) {
    			   arr[i][j] = temp;
    		   }
    	   }
       }
       while(!start.isEmpty()) {
    	   Integer tmp[] = start.poll();
    	   int x = tmp[0];
    	   int y = tmp[1];
    	   for(int i = 0; i < 4; i++) {
    		   int nx = x + dx[i];
    		   int ny = y + dy[i];
    		   if(nx < 0 || ny < 0 || nx > N - 1 || ny > M - 1) {
    			   continue;
    		   }
    		   if(arr[nx][ny] == 0) {
    			   start.add(new Integer[] {nx, ny});
    			   arr[nx][ny] = arr[x][y] + 1;
    		   }
    	   }
       }
       int ans = Integer.MIN_VALUE;
       boolean bad = true;
       
       for(int i = 0; i < N; i++) {
    	   for(int j = 0; j < M; j++) {  		   
    		   if(arr[i][j] == 0) {
    			   bad = false;
    		   }
    		   ans = Math.max(ans, arr[i][j] - 1);
    	   }
       }
       
       if(!bad) System.out.println(-1);
       else System.out.println(ans);
    }
}
