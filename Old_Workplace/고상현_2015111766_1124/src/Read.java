import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte data[] = new byte[50];
		int n=0, temp;
		
		try { 
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.bin"); //파일을 읽기 위한 inputstream
			while( (temp = fin.read()) != -1 ) { // 더이상 읽을 값이 없으면 -1 return, while 문 나감
				data[n++]=(byte)temp; // temp=fin.read()이기 때문에 data배열에 차곡차곡 쌓인다
			}
			fin.close();
		} catch(IOException e) { // 예외 발생 시 실행
			System.out.println("읽기불가");
			return;
		}
		
		for(int i = 0; i < n; i++) { // 쓴 데이터 출력
			System.out.print(data[i]+" ");
		}
		System.out.print("\n 파일 읽기 완료");
	}
}
