import java.util.Scanner;
public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("철수 >>");
		String a = sc.next();
		System.out.print("영희 >>");
		String b = sc.next();
		
		if(a.equals("가위")) {
			if(b.equals("가위"))
				System.out.print("비겼습니다");
			else if(b.equals("바위"))
				System.out.print("영희가 이겼습니다");
			else if(b.equals("보"))
				System.out.print("철수가 이겼습니다");
		}
		if(a.equals("바위")) {
			if(b.equals("가위"))
				System.out.print("철수가 이겼습니다");
			else if(b.equals("바위"))
				System.out.print("비겼습니다");
			else if(b.equals("보"))
				System.out.print("영희가 이겼습니다");
		}
		if(a.equals("보")) {
			if(b.equals("가위"))
				System.out.print("영휘가 이겼습니다");
			else if(b.equals("바위"))
				System.out.print("철수가 이겼습니다");
			else if(b.equals("보"))
				System.out.print("비겼습니다");
		}
				
		sc.close();
	}

}
