import java.io.FileInputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data[] = new int[1024*1024*10]; //�����̴ϱ� �ּ� 3�ڸ��� �ʿ� 
		
		int n = 0, temp;
		
		int pos = 0; // ������ �д����� ���� �迭�� ��ġ�� �˱� ���� position
		// BMP ������ ù��° 2�� ����Ʈ�� �ƽ�Ű�ڵ� BM�� �־��. �̰��� Ȯ���ϴ� �ܰ�
		
		char[] bfType = new char[2];
		
		// �ѹ��� 4�� �Ǵ� 2���� �о������
		byte[] short_byte = new byte[2];
		byte[] int_byte = new byte[4];
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Temp\\X-logo.bmp");

			bfType[0] = (char)fin.read(); // read -> �� ����Ʈ�� �о�´�
			bfType[1] = (char)fin.read();	
			
			/*System.out.println("bfType = "+bfType[0]+bfType[1]); // BM ���� Ȯ��
			
			System.out.format("0x%02x%n", (byte)fin.read()); // BM�� �а� �� ����Ʈ�� ��� ������
			System.out.format("0x%02x%n", (byte)fin.read()); 
			System.out.format("0x%02x%n", (byte)fin.read()); 
			System.out.format("0x%02x%n", (byte)fin.read()); // �� 4����Ʈ
			// BMP�� little-endian ������� �Ǿ��ִ�. ������ �ٲپ ����ؾ���
			*/
			
			fin.read(int_byte);
			int bfSize = ( (int)int_byte[0]&0xff | ((int)int_byte[1]&0xff)<<8 | ((int)int_byte[2]&0xff)<<16 | ((int)int_byte[3]&0xff)<<24);
			// int_byte �� ����ִ� ���� 4����Ʈ�� ������ ��Ʈ�� �����ϹǷ� int�� �ٲپ��ְ� ���� 0000�� �ٿ���
			// 0xff�� 0�� �� �߶��ش�.
			
			System.out.println("����ũ��: "+bfSize+"B");
			//00 12 f1 56 �� ������ ������ ��µȴ�.
			
			fin.read(short_byte); // ���ٸ� ���� �а� ��ŵ�ϰ� ��
			
			// ������ ���� ���� ũ�� �˾ƺ���
			
//			while( (temp=fin.read())!=-1 ) { // �ڹٿ����� integer -1�� ������� �ڵ� Ȯ����
//				data[n++] = temp;
//			}
			fin.close();
			
		} catch (Exception e) {
			System.out.println("�����б� ����");
			return;
		}
	}	
}
