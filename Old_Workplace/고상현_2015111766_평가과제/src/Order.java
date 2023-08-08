
class Order {
	private int[][] ords = new int[10][3];
	private int count = 0;
	private Drone drone = new Drone();
	private District dist = new District();
	private String check;
	private String recheck;
	
	Order() {
		for(int i = 0; i < ords.length; i++) {
			ords[i][0] = -1;	
		}
	}

	void show() {
		for(int i = 0; i < ords.length; i++) {
			System.out.print((i+1) + "�� �ֹ�: ");
			System.out.println(ords[i][0]+"����, "+ ords[i][1] + "Km, " + ords[i][2] + "Kg");
		}
	}	
	String check_order() {
		if(ords[0][0] == -1) {
			return "empty";
		}
		else {
			return "check";
		}
	}
	void confirm(int district, int Km, int weight) {
		 check = drone.test_run(district, Km, weight, dist);
		 if(check.equals("fail")) {
				System.out.println("��� �Ұ����մϴ�.");
				ords[count][0] = district;
				ords[count][1] = Km;
				ords[count][2] = weight;
				count = (count+1) % 10;
				System.out.println("������ ����� ����Ǿ����ϴ�.");
		 }
		 else if(check.equals("Success")) {
				System.out.println("��� ����!");
				dist = new District();
		 }
	}
	
	void re_confirm(int i, int bat, double prop, double load) {
		 recheck = drone.new_test_run(ords[i-1][0], ords[i-1][1], ords[i-1][2], bat, prop, load, dist);
		 if(recheck.equals("fail")) {
				System.out.println("��� �Ұ����մϴ�.");
				System.out.println("������ �ʰ��� ��޷� �����˴ϴ�.");
				for(int j = 0; j < ords[0].length; j++) {
					ords[i-1][j] = -1;
				}
		 }
		 else if(recheck.equals("Success")) {
				System.out.println("��� ����!");
				dist = new District();
		 }
	}
	
	void get_weather(int i) {
		dist.get_weather(i);
	}
	void cnt_Drone_count(int i) {
		dist.cnt_drone(i);
	}
	void Drone_ability(int km, int weight) {
		drone.Drone_ability(km, weight);
	}
}

