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
		System.out.println("중복없는 난수 개수 입력 > ");
		size = sc.nextInt();
		
		// 중복없는 난순 발생기
		for(int i = 0; i < size; i++) {
			data[i] = (byte)(Math.random()*90+10);
			for(int j = 0; j < i; j++) {
				if(data[i]==data[j]) { // 중복 발생 시
					i--; // i를 1만큼 줄이고
					j=i; // j에 i를 대입하여 다시 상위 반복문으로 돌아가 난수 생성
				}
			}
		}
		try { // try catch 문으로 예외처리
			FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.bin");
			for(int i = 0; i < size; i++) {
				fout.write(data[i]);
			}
			fout.close();
		} catch(IOException e) { // 예외 발생 시 실행
			System.out.println("저장불가");
			return;
		}
		
		for(int i = 0; i< size; i++) { // 쓴 데이터 출력
			System.out.print(data[i]+" ");
		}
		System.out.print("\n 파일 쓰기 완료");
	}
}