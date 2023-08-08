
public class Quiz {
	
	int speed_limit() {
		int n = (int)(Math.random()*4);
		switch(n) {
		case 0:
			return 60;
		case 1:
			return 70;
		case 2:
			return 80;
		case 3:
			return 100;
		}
		return 0;
	}
	
	int count(String src, String hunt) {
		int cnt = 0;
		int cut = hunt.length();
		for(int i = 0; i<(src.length()-cut+1); i++) {
			if(src.substring(i, i+cut).equals(hunt))
				cnt++;
		}
		return cnt;
	}
}
