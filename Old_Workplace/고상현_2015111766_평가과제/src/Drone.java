
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
		
		System.out.println("���� ����� ���͸� �Ҹ��� " + (efficiency * (weight/max_weight) * weather_affect * propeller) + "�Դϴ�");
		System.out.println("ȭâ�� ���������� �ִ� " + (int)(bat_capacity/((efficiency * (weight/max_weight) * 1 * propeller))) + "Km �̵� �����մϴ�");
		System.out.println("�� ���� ���������� �ִ� " + (int)(bat_capacity/((efficiency * (weight/max_weight) * 1.2 * propeller))) + "Km �̵� �����մϴ�");
		System.out.println("���� ���� ���������� �ִ� " + (int)(bat_capacity/((efficiency * (weight/max_weight) * 1.4 * propeller))) + "Km �̵� �����մϴ�");
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
			System.out.println("���� ���� ���Ը� �ʰ��߽��ϴ�.");
			fail_chk = "fail";
		}
		if((int)(bat_capacity/((efficiency * (weight/max_weight) * weather_affect * propeller))) < km) {
			System.out.println("�̵� ���� �Ÿ��� �ʰ��߽��ϴ�.");
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
			System.out.println("������ ���� ��� ���� �ʰ��߽��ϴ�.");
			fail_chk = "fail";
		}
		if(max_weight < weight) {
			System.out.println("���� ���� ���Ը� �ʰ��߽��ϴ�.");
			fail_chk = "fail";
		}
		if((int)(bat_capacity/((efficiency * (weight/max_weight) * weather_affect * propeller))) < km) {
			System.out.println("�̵� ���� �Ÿ��� �ʰ��߽��ϴ�.");
			fail_chk = "fail";
		}
		else fail_chk = "Success";
		return fail_chk;
	}
}
