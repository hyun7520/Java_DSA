import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringTokenizer sr;
		String yn;
		
		menu();
		
		Order ord = new Order();
		
		while(true) {
			int N = Integer.parseInt(bf.readLine());
			
			switch(N) {
			case 1:
				System.out.println("주문 입력{지역(1~5) 거리(기본최대 적재량 = 50) 무게}: ");
				st = new StringTokenizer(bf.readLine());
				int district = Integer.parseInt(st.nextToken());
				int Km = Integer.parseInt(st.nextToken());
				int weight = Integer.parseInt(st.nextToken());
				System.out.println("주문 확인 ->\n" + "지역: " + district + " 거리: " + Km + " 무게: " + weight);
				ord.Drone_ability(Km, weight);
				System.out.println("주문을 시작하시겠습니까? -> Y/N");
				yn = bf.readLine();
				if(yn.equals("Y") || yn.equals("y")) {
					System.out.println("주문을 시작합니다");
					System.out.println("가능 여부 확인중...");
					ord.confirm(district, Km, weight);
				}
				if(yn.equals("N") || yn.equals("n")) {
					System.out.println("메뉴로 돌아갑니다");
					menu();
				}
				break;
			case 2:
				if(ord.check_order().equals("empty")) {
					System.out.println("보류중인 주문이 없습니다!");
					System.out.println("메뉴로 돌아갑니다.");
					menu();
				}
				else if(ord.check_order().equals("check")) {
					ord.show();
					System.out.println("새로운 드론으로 재주문을 시도하시겠습니까? Y/N");
					yn = bf.readLine();
					if(yn.equals("Y") || yn.equals("y")) {
						System.out.println("재주문을 시도할 주문 번호를 입력해주십시오");
						int n = Integer.parseInt(bf.readLine());
						Drone drone = new Drone();
						System.out.println("새롭게 제작할 드론의 스펙을 입력하십시오.");
						System.out.println("배터리 프로펠러 적재용량 (기본 = 100, 1, 50)"+ "->");
						sr = new StringTokenizer(bf.readLine());
						int new_bat = drone.part.change_bat(Integer.parseInt(sr.nextToken()));
						double new_prop = drone.part.change_prop(Double.parseDouble(sr.nextToken()));
						double new_load = drone.part.change_load(Double.parseDouble(sr.nextToken()));
						ord.re_confirm(n, new_bat, new_prop, new_load);
					}
					if(yn.equals("N") || yn.equals("n")) {
						System.out.println("메뉴로 돌아갑니다");
						menu();
					}
				}
				break;
			case 3:
				System.out.println("지역 번호 입력(1~5): ");
				int dist_no = Integer.parseInt(bf.readLine());
				System.out.print("해당 지역의 날씨는: ");
				ord.get_weather(dist_no);
				break;
				
			case 4:
				System.out.println("지역 번호 입력(1~5): ");
				dist_no = Integer.parseInt(bf.readLine());
				System.out.print("지역의 드론 수가 70대 이상일 경우 배달이 불가능합니다. 현재 드론수: ");
				ord.cnt_Drone_count(dist_no);
				break;
				
			case 5:
				menu();
				break;
				
			case 0:
				System.out.println("시스템 종료");
				System.exit(0);
			}
		}
		
	}
	static void menu() {
		System.out.println("드론 주문");
		System.out.println("1. 오더 입력");
		System.out.println("2. 실패한 주문 확인");
		System.out.println("3. 기상 상황");
		System.out.println("4. 지역별 드론 현황");
		System.out.println("5. 메뉴 재출력");
		System.out.println("0. 시스템 종료");
	}

}
