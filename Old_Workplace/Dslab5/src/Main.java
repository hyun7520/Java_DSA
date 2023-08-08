import java.util.Scanner;
public class Main {
	// return true if p is prime 
	static boolean isPrime(int p) {
		//if the number of divisors is 2, prime. ����� ������ 2��� �Ҽ�
		int dcount = 0; //��� ī��Ʈ
		for(int i = 1; i <= p; i++) {
			if( p%i == 0 ) dcount++;   //�̰��� �������� ��´�. P�� ����
		}
		return dcount == 2;            //��� ������ 2��� True ����
		//if(dcount == 2) ��ü�ε� boolean, decount�� 2�̸� True�� ����
	}
	static boolean isPrime1(int p) {
		if(p == 1) return false;       // if p is 1, return false.
		for(int i = 2; i < p; i++) { 
			if(p%i == 0) return false; // if p is divided by 2 ~ p-1, p is not a prime pumber
		}
		return true;
	}
	static boolean isPrime2(int p) {
		if(p == 1) return false; //if p is 1, return false
		// if p is divided by 2 ~ sqrt(p), p is not a prime number.
		for(int i = 2; i*i <= p; i++) {
			if(p%i == 0) return false; //n�� ȣ���� ��Ʈn�� �����ϱ⿡ O(n��Ʈn) �˰����� �ȴ�.
		}
		return true;
	}
	// return the number of primes less than equal to n.
	static int pi(int n) {
		int pcount = 0;
		for(int i = 1; i <= n; i++) {
			if( isPrime2(i) ) pcount++; //�̰��� �������� i�� n�� ���� n�� 1�϶� p�� 1��, n�� 2�϶� p�� 2�� ���� ��ӵǸ� 
			// 1+2+3+4 .... i�� n�̸� p�� ���� n*(n+1)/2 = N**2/2 + n/2 �̱⿡ O(n**2)�˰����̶�� �Ҽ� �ִ�.
			//��� isPrime �� O(n**2)�˰����̴�.
			
		}
		return pcount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long timeStamp = System.currentTimeMillis(); // ���ð� ����
		int pcount = pi(n);
		long elapsed = System.currentTimeMillis() - timeStamp;//�����ð� ���� ���ð����� �ɸ��ð� ����
		System.out.println("pi("+n+")="+pcount);
		System.out.println("Elapsed time is "+elapsed+" ms");
	}

}
