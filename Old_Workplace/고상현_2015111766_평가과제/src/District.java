
class District {
	
	private String[][] Dist;
	
	District() {
		Dist = new String[5][2];
		for(int i = 0; i < Dist.length; i++) {
			int N = (int)(Math.random()*3)+1;
			Dist[i][1] = Integer.toString(N);
			switch(Integer.parseInt(Dist[i][1])) {
			case 1:
				Dist[i][1] = "rain";
				break;
			case 2:
				Dist[i][1] = "snow";
				break;
			case 3:
				Dist[i][1] = "sunny";
				break;
			//구역별 기상상황 [i][1]
			}	
		}
		for(int j = 0; j< Dist.length; j++) {
			int M = (int)(Math.random()*100);
			Dist[j][0] = Integer.toString(M);
			//구역별 드론 수 [i][0]
		}
	}	

	void get_weather(int dist_no) {
		if(dist_no > 5 || dist_no < 1) {
			System.out.println("없는 구역입니다");
		}
		else {
			System.out.println(Dist[dist_no - 1][1]);
		}
	}
	
	void cnt_drone(int dist_no) {
		if(dist_no > 5 || dist_no < 1) {
			System.out.println("없는 구역입니다");
		}
		else {
			System.out.println(Dist[dist_no - 1][0]);
		}
	}
	String chk_weather(int dist2) {
		return Dist[(dist2 - 1)][1];
		
	}
	int chk_Drone_count(int dist2) {
		return Integer.parseInt(Dist[(dist2 - 1)][0]);
	}
}
