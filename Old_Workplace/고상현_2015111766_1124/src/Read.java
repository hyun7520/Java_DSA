import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte data[] = new byte[50];
		int n=0, temp;
		
		try { 
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.bin"); //������ �б� ���� inputstream
			while( (temp = fin.read()) != -1 ) { // ���̻� ���� ���� ������ -1 return, while �� ����
				data[n++]=(byte)temp; // temp=fin.read()�̱� ������ data�迭�� �������� ���δ�
			}
			fin.close();
		} catch(IOException e) { // ���� �߻� �� ����
			System.out.println("�б�Ұ�");
			return;
		}
		
		for(int i = 0; i < n; i++) { // �� ������ ���
			System.out.print(data[i]+" ");
		}
		System.out.print("\n ���� �б� �Ϸ�");
	}
}
