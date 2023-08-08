import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2자리 정수를 입력하시요. 0을 입력하면 종료>");
		
		int[] arr = new int[40];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] == 0) {
				break;
			}
		}
		System.out.println(arr);
		int temp = 0;
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i <arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		temp = arr[-1];
		arr[-1] = max;
		max = temp;
		
		System.out.println(arr);
	}
}
