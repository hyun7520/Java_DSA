import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1-1)");
		System.out.print("설정값 입력 ->");
		int n = sc.nextInt();
		System.out.print("0x");
		System.out.printf("%08X\n",n);
		
		System.out.println("1-2)");
		System.out.println("설정할 비트 위치 (32~1)>");
		int bit = sc.nextInt();
		n = n | (1 << (bit -1));
		System.out.print("0x");
		System.out.printf("%08X\n",n);
		
		System.out.println("2-1)");
		
		System.out.print("2차원배열 가로, 세로 입력> ");
		int row = 0, col = 0;
		row = sc.nextInt();
		col = sc.nextInt();
		
		int[][] arr = new int[col][row];
		
		for(int i = 0; i < row; i++) {
			for(int j =0; j< col; j++) {
				arr[j][i] = ((int)(Math.random()*10));
			}
		}
		for(int i = 0; i < col; i++) {
			for(int j =0; j< row; j++) {
				System.out.print(arr[i][j]);
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		
		}
		System.out.println("2-2)");
		for(int i = 0; i < row; i++) {
			for(int j =0; j< col; j++) {
				System.out.print(arr[j][i]);
				System.out.print(arr[j][i]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("3-1)");
		Leaf leaf = new Leaf(250);
		leaf.show();
	}

}
