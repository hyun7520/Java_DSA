
public class Drone {
	
	private double weather_affect;
	private double max_weight;
	private int bat_capacity;
	private double propeller;
	private double efficiency;
	private String weather;
	private int Drone_cnt;
	private String fail_chk = "";
	Parts part;
	
	Drone() {
		part = new Parts();
		
		efficiency = 15;
		bat_capacity = 100;
		propeller = 1;
		weather_affect = 1;
		max_weight = 50;
		
	}
	void Drone_ability(double km, int weight) {
		
		System.out.println("현재 드론의 배터리 소모량은 " + (efficiency * (weight/max_weight) * weather_affect * propeller) + "입니다");
		System.out.println("화창한 지역에서는 최대 " + (int)(bat_capacity/((efficiency * (weight/max_weight) * 1 * propeller))) + "Km 이동 가능합니다");
		System.out.println("비가 오는 지역에서는 최대 " + (int)(bat_capacity/((efficiency * (weight/max_weight) * 1.2 * propeller))) + "Km 이동 가능합니다");
		System.out.println("눈이 오는 지역에서는 최대 " + (int)(bat_capacity/((efficiency * (weight/max_weight) * 1.4 * propeller))) + "Km 이동 가능합니다");
	}
	
	String new_test_run(int dist, int km, int weight, int bat, double prop, double load, District di) {
		bat_capacity = bat;
		max_weight = load;
		propeller = prop;
		weather = di.chk_weather(dist);
		if(weather.equals("rain")) weather_affect = 1.2;
		if(weather.equals("snow")) weather_affect = 1.4;
		else weather_affect = 1;
		
		if(max_weight < weight) {
			System.out.println("적재 가능 무게를 초과했습니다.");
			fail_chk = "fail";
		}
		if((int)(bat_capacity/((efficiency * (weight/max_weight) * weather_affect * propeller))) < km) {
			System.out.println("이동 가능 거리를 초과했습니다.");
			fail_chk = "fail";
		}
		else fail_chk = "Success";
		return fail_chk;
	}
	
	String test_run(int dist, int km, int weight, District di) {
		weather = di.chk_weather(dist);
		Drone_cnt = di.chk_Drone_count(dist);
		if(weather.equals("rain")) weather_affect = 1.2;
		if(weather.equals("snow")) weather_affect = 1.4;
		else weather_affect = 1;
		
		if(Drone_cnt + 1 > 70) {
			System.out.println("구역의 제한 드론 수가 초과했습니다.");
			fail_chk = "fail";
		}
		if(max_weight < weight) {
			System.out.println("적재 가능 무게를 초과했습니다.");
			fail_chk = "fail";
		}
		if((int)(bat_capacity/((efficiency * (weight/max_weight) * weather_affect * propeller))) < km) {
			System.out.println("이동 가능 거리를 초과했습니다.");
			fail_chk = "fail";
		}
		else fail_chk = "Success";
		return fail_chk;
	}
}
