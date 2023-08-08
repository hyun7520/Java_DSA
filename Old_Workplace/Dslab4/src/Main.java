import java.util.Scanner;
public class Main {
	/*
	static long sum(int n) {
		long sum = 0;           //���� sum�� �Ʒ��� sum �ٸ��� �ν�, �ѹ��� ����
		for(int i = 1; i <= n; i++) {
			sum += i;   //n�� ���� ��� O(N) �˰����̶�� �� �� �ִ�. 
		}
		return sum;  //�ѹ��� ����
		//1 + n + 1 ������ ������ �������� ���� �ѹ��� ����Ǵ� ���� �����Ҽ� �ִ�. 
	}
	*/
	// advanced algorithm for summing from 1 to n.
	static long advSum(int n){
		//long n1 =(long) n;  ����ȯ�� ���ְų� ���� ����ó�� n�� ����ȯ���ش�. ������� int�� ����� �ʴ´�.
		long sum = (long)n * (n+1) / 2; //O1 �˰����̴� n�� ���� ���� X,
		//���ϱ� �ѹ� ������ �ѹ� ���ϱ� �ѹ� +�ѹ����� ������ ���� ���ѵǾ� ����.		
		return sum;  
		//�ּ� ó�� �˰��򺸴� ������ �˰����̴�. 5�� ������ ���� 160ms���� 0ms �� �پ��
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long timeStamp = System.currentTimeMillis();
		long result = advSum(n);
		long elapsedTime = System.currentTimeMillis() - timeStamp;
		System.out.println("sum form 1 to " +n+ " is " +result);
		System.out.println("Elapsed time is " +elapsedTime+"ms");
		/*
		int n = scan.nextInt();
		long timeStamp = System.currentTimeMillis();
		long result = sum(n);
		System.out.println("n = "+ n);
		long elapsedTime = System.currentTimeMillis() - timeStamp;
		System.out.println("sum form 1 to " +n+ " is " +result);
		System.out.println("Elapsed time is " +elapsedTime+"ms");
		*/

	}

}
