import java.io.FileInputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data[] = new int[1024*1024*10]; //영상이니까 최소 3자리는 필요 
		
		int n = 0, temp;
		
		int pos = 0; // 어디까지 읽는지에 대한 배열의 위치를 알기 위한 position
		// BMP 파일의 첫번째 2개 바이트에 아스키코드 BM을 넣어둠. 이것을 확인하는 단계
		
		char[] bfType = new char[2];
		
		// 한번에 4개 또는 2개씩 읽어오도록
		byte[] short_byte = new byte[2];
		byte[] int_byte = new byte[4];
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Temp\\X-logo.bmp");

			bfType[0] = (char)fin.read(); // read -> 한 바이트씩 읽어온다
			bfType[1] = (char)fin.read();	
			
			/*System.out.println("bfType = "+bfType[0]+bfType[1]); // BM 파일 확인
			
			System.out.format("0x%02x%n", (byte)fin.read()); // BM을 읽고 한 바이트만 헥사 값으로
			System.out.format("0x%02x%n", (byte)fin.read()); 
			System.out.format("0x%02x%n", (byte)fin.read()); 
			System.out.format("0x%02x%n", (byte)fin.read()); // 총 4바이트
			// BMP는 little-endian 방식으로 되어있다. 순서를 바꾸어서 출력해야함
			*/
			
			fin.read(int_byte);
			int bfSize = ( (int)int_byte[0]&0xff | ((int)int_byte[1]&0xff)<<8 | ((int)int_byte[2]&0xff)<<16 | ((int)int_byte[3]&0xff)<<24);
			// int_byte 에 들어있는 값을 4바이트의 최하위 비트로 가야하므로 int로 바꾸어주고 아페 0000을 붙여줌
			// 0xff로 0을 다 잘라준다.
			
			System.out.println("파일크기: "+bfSize+"B");
			//00 12 f1 56 이 인터절 값으로 출력된다.
			
			fin.read(short_byte); // 한줄만 쓰면 읽고 스킵하게 됨
			
			// 영상의 가로 세로 크기 알아보기
			
//			while( (temp=fin.read())!=-1 ) { // 자바에서는 integer -1로 엔드오브 코드 확인함
//				data[n++] = temp;
//			}
			fin.close();
			
		} catch (Exception e) {
			System.out.println("파일읽기 오류");
			return;
		}
	}	
}
