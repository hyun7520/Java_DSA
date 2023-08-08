import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����Ʈ�� ���� >");
		
		int n = sc.nextInt();
		
		// step 1) �迭 �� �ʱⰪ ����
		
		boolean[] arr= new boolean[2*n]; // 2n ũ���� boolean Ÿ�� �迭 ����
		
		for(int i = 2; i < 2*n; i++) arr[i] = true;
		
		int sqrt2N = (int)Math.sqrt(2*n); //int�̱⿡ (int)�� �־��־�� �Ѵ�. double�̸� �׳� ����
		
		// step 2) ü �˰��� �����
		
		for(int i=2; i<=sqrt2N; i++) { //i*i<=2n
			if(arr[i]) {
				for(int j=i*i; j<2*n; j+=i) {
					arr[j] = false;
				}
			}
		}
		
		// step 3) ����Ʈ�� ���� ����
		
		// n< p <2n �Ҽ��� ���� ���ϱ�
		int count = 0;
		for(int i = n+1; i<2*n; i++) {
			if(arr[i])
				count++;
		}

	
		System.out.println(count);
	}
}
