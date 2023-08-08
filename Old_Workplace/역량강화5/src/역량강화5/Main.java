package 역량강화5;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>(); 
		
		arr.get(1).add(2);
		arr.get(1).add(3);
		
		for(int i = 0; i < arr.size(); i++) {
			for(int j = 0; j < arr.size(); j++) {
				System.out.println(arr.get(i).get(j));
			}
		}
	}

}
