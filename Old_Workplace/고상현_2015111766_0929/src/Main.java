import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영단어 연습");
		
		String [][] arr = { {"string", "실"}, {"research", "연구" },{"cat", "고양이"}, {"dog", "개"}, {"bird", "새"},
				{"pig", "돼지"}, {"fly", "날다"}, {"run", "달리다"}, {"walk", "걷다"}, {"apple", "사과"}
		};
		
		int pt = 0;
		while(true) {
			System.out.println("현재 점수 = "+pt);
			if(pt == 3 || pt == -3) break;
			
			int col = (int)(Math.random()*9);
			System.out.println(arr[col][0]);
			System.out.println("뜻 입력>");
			String ans = sc.nextLine();
			
			if(ans.equals(arr[col][1])) {
				pt += 1;
				System.out.println("정답입니다");
			}
			else {
				pt -= 1;
				System.out.println("오답입니다");
			}
		}
		sc.close();
	}

}
