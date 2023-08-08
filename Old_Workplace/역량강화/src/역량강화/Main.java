package 역량강화;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int[] arr = new int[6];
		
		for(int i = 1; i < 6; i++) {
			if(arr[i]==0) {
				arr[i]=1;
				for(int j = 1; j < 6; j ++) {
					if(arr[j]==0) {
						arr[j] = 1;
						for(int k = 1; k < 6; k++) {
							if(arr[k] != 1) {
								System.out.println("a="+i+", "+"b="+j+", "+"c="+k);
							}
						}
						arr[j]=0;
					}
				}
				arr[i]=0;
			}
		}
	}

}
