import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte data[] = new byte[50];
		int size;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ߺ����� ���� ���� �Է� > ");
		size = sc.nextInt();
		
		// �ߺ����� ���� �߻���
		for(int i = 0; i < size; i++) {
			data[i] = (byte)(Math.random()*90+10);
			for(int j = 0; j < i; j++) {
				if(data[i]==data[j]) { // �ߺ� �߻� ��
					i--; // i�� 1��ŭ ���̰�
					j=i; // j�� i�� �����Ͽ� �ٽ� ���� �ݺ������� ���ư� ���� ����
				}
			}
		}
		try { // try catch ������ ����ó��
			FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.bin");
			for(int i = 0; i < size; i++) {
				fout.write(data[i]);
			}
			fout.close();
		} catch(IOException e) { // ���� �߻� �� ����
			System.out.println("����Ұ�");
			return;
		}
		
		for(int i = 0; i< size; i++) { // �� ������ ���
			System.out.print(data[i]+" ");
		}
		System.out.print("\n ���� ���� �Ϸ�");
	}
}