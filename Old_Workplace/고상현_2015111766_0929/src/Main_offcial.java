import java.util.Scanner;
public class Main_offcial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ܾ� ����");
		
		String [][] arr = { {"string", "��"}, {"research", "����" },{"cat", "�����"}, {"dog", "��"}, {"bird", "��"},
				{"pig", "����"}, {"fly", "����"}, {"run", "�޸���"}, {"walk", "�ȴ�"}, {"apple", "���"}
		};
		
		//�ڹٴ� [��][��]
		
		int row = arr.length; //10
		int col = arr[0].length; //2 0���� ���� 
		for(int i = 0; i < row; i++) {
			for(int j=0; j<col; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		int cnt = 2, quiz;
		String ans;
		System.out.println("\n�ܾ��� ����");
		while(true) {
			quiz =(int)(Math.random()*row); //0�� 10������ �� ����
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
