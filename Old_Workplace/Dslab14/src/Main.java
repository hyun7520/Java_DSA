import java.util.Random;
import java.util.Scanner;
public class Main {
	static void selectionSort(int[] v, int n) {
		for(int i = 0; i < n-1; i++) {
			//find minimun value index from i to n-1
			int min = i; 
			for(int j = i+1; j < n; j++) {
				if(v[j] < v[min]) min = j; { //���ų� ���ٷ� �Ұ�� ������ �ߺ� �� ���� �Էµ� ���� ���� ó�� �ȵ�
				}
				int t = v[i];
				v[i] = v[min];
				v[min] = t;
			}
		}
	}
	static void insertionSort(int[] v, int n) {
		for(int i = 1; i < n; i++) {
			int t = v[i], last = i - 1;
			while(last >= 0 && v[last] > t) {
				v[last + 1] = v[last];
				last--;
			}
			v[last+1] = t;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�⺻���� ���� �ǽ�");
		Random rand = new Random(100); // ������ ���� ���� x
		//100�� seed���� ��, �׻� ���� ���� ����
		//���� �߻� �� seed ���� �˸� ������ ã�� ����.
		/*for(int i = 0; i < 10; i++) {
			System.out.println(rand.nextInt(1000000)); // �������� �ݺ�
		}*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// make int array sized n
		int[] v = new int[n];
		//generate random values
		for(int i = 0; i < n; i++) {
			v[i] = rand.nextInt(1000000);
		}
		long ts = System.currentTimeMillis();
		//sorting
		
		//selectionSort(v, n);
		
		insertionSort(v, n);
		ts = System.currentTimeMillis() -ts;
		//data validation
		for(int i = 0; i < 10; i++) System.out.println(v[i]);
		//print elapsed time
		System.out.println("Elapsed time is "+ts+"ms.");
	}

}
