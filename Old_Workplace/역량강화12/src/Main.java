import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer st;
		HashSet<String> hash = new HashSet<>();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			String name = st.nextToken();
			String IO = st.nextToken();
			if(IO.equals("enter")) {
				hash.add(name);
			}
			else hash.remove(name);
		}
		ArrayList<String> arr= new ArrayList<String>(hash);
		Collections.sort(arr);
		System.out.println(arr.size());
		for(int i = 0 ; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}

}
