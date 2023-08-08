import java.util.Scanner;
public class Main_offcial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영단어 연습");
		
		String [][] arr = { {"string", "실"}, {"research", "연구" },{"cat", "고양이"}, {"dog", "개"}, {"bird", "새"},
				{"pig", "돼지"}, {"fly", "날다"}, {"run", "달리다"}, {"walk", "걷다"}, {"apple", "사과"}
		};
		
		//자바는 [행][열]
		
		int row = arr.length; //10
		int col = arr[0].length; //2 0행의 열수 
		for(int i = 0; i < row; i++) {
			for(int j=0; j<col; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		int cnt = 2, quiz;
		String ans;
		System.out.println("\n단어장 문제");
		while(true) {
			quiz =(int)(Math.random()*row); //0과 10사이의 수 랜덤
			System.out.print(arr[quiz][1]+"-> ");
			ans = sc.next();
			if(ans.equals(arr[quiz][0])) {
				System.out.println("YES");
				cnt++;
				if(cnt == 5) {
					System.out.println("PASS");
					break;
				}
			}
			else {
				System.out.println("NO");
				cnt--;
				if(cnt<0) {
					System.out.println("FAIL");
					break;
				}
			}
		}
	}

}
