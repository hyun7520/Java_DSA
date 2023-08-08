import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ≥≠¿Ô¿Ã {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> arr = new ArrayList<>();
		int height = 0;
		int n = 9;
		
		for(int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(bf.readLine()));
			height += arr.get(i);
		}
		
		Collections.sort(arr);
		
		for(int i = 0; i < n -1; i++) {
			for(int j = i+1; j < n; j++) {
				if(height - arr.get(i) - arr.get(j) == 100) {
					for(int k = 0; k < n; k++) {
						if(i == k || j == k) continue;
						System.out.println(arr.get(k));
					}	
				}
			}
		}	
	}
}
