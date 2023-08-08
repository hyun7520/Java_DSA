package 역량강화11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 토마토3차원 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	       StringTokenizer st = new StringTokenizer(bf.readLine());
	       
	       int N = Integer.parseInt(st.nextToken());
	       int M = Integer.parseInt(st.nextToken());
	       int H = Integer.parseInt(st.nextToken());
	       int[][][] arr = new int[M][N][H];
	       int[] dx = {0, 0, 0, 0, 1, -1};
	   	   int[] dy = {0, 0, 1, -1, 0, 0};
	   	   int[] dz = {1, -1, 0, 0, 0, 0};
	       Queue<Integer[]> start = new LinkedList<>();
	       // visit 배열 추가해서 풀어보기
	       
	       for(int k = 0; k < H; k++) {
	    	   for(int i = 0; i < M; i++) {
		    	   st = new StringTokenizer(bf.readLine());
		    	   for(int j = 0; j < N; j++) {
		    		   int temp = Integer.parseInt(st.nextToken());
		    		   if(temp == 1) {
		    			   start.add(new Integer[] {i, j, k});
		    			   arr[i][j][k] = 1;
		    		   }
		    		   if(temp == 0 || temp == -1) {
		    			   arr[i][j][k] = temp;
		    		   }
		    	   }
	    	   }
	       }
	       while(!start.isEmpty()) {
	    	   Integer tmp[] = start.poll();
	    	   int x = tmp[0];
	    	   int y = tmp[1];
	    	   int z = tmp[2];
	    	   for(int i = 0; i < 6; i++) {
	    		   int nx = x + dx[i];
	    		   int ny = y + dy[i];
	    		   int nz = z + dz[i];
	    		   if(nx < 0 || ny < 0 || nz < 0 || nx > M - 1 || ny > N - 1 || nz > H - 1) {
	    			   continue;
	    		   }
	    		   if(arr[nx][ny][nz] == 0) {
	    			   start.add(new Integer[] {nx, ny, nz});
	    			   arr[nx][ny][nz] = arr[x][y][z] + 1;
	    		   }
	    	   }
	       }
	       int ans = Integer.MIN_VALUE;
	       boolean bad = true;
	       
	       for(int k = 0; k < H; k++) {
	    	   for(int i = 0; i < M; i++) {
		    	   for(int j = 0; j < N; j++) { 
		    		   if(arr[i][j][k] == 0) {
		    			   bad = false;
		    		   }
		    		   ans = Math.max(ans, arr[i][j][k] - 1);
		    	   }
		       }
	       }	   
	       
	       if(!bad) System.out.println(-1);
	       else System.out.println(ans);
	}

}
