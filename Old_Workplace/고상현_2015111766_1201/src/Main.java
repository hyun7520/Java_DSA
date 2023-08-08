import java.awt.Color;
import java.awt.Graphics;
import java.io.FileInputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	
	Main(){
		setTitle("컬러영상 뷰어");
		setContentPane(new MyPanel());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,1000);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			// 1. 바이너리 파일 리드 : 이미지
			int data[] = new int[600*2000]; // 데이터 저장할 배열 생성
			int H, W;
			int n = 0, temp;
			// H = 256;   //girl.raw
			// W = 256;
			H = 512; // 세로
			W = 512; // 가로
			// H = 380    //Kim.raw
			// W = 380
			
			int colorW = W*3; // 컬러의 경우 1pixel = 3bite 이므로 W를 3배 늘려준다
			
			FileInputStream fin;
			
			try { // 파일 읽어오기
				fin = new FileInputStream("C:\\Temp\\barbara.raw");
				while( (temp=fin.read()) != -1 ) {
					data[n++] = temp;
				}
				fin.close();
			} catch (Exception e) {
				System.out.println("파일읽기 오류");
				return;
			}
			
			// 2. 1차원배열 -> 2차원배열 변환
			int R[][] = new int[600][600]; // R
			int G[][] = new int[600][600]; // G
			int B[][] = new int[600][600]; // B
			
			
			
			for(int i = 0;i < H; i++) { // 세로
				for(int j = 0; j < colorW; j++) { // 가로
					switch(j%3) { // data=[1.1.R, 1.1.G, 1.1.B, ~ 512*3.512.R, 512*3.512G, 512*3.512.B
					case 0:
						R[i][j/3] = data[i*colorW+j];
						break;
					case 1:
						G[i][j/3] = data[i*colorW+j];
						break;
					case 2:
						B[i][j/3] = data[i*colorW+j];
						break;
					}
				}
			}
			// 3. 화면에 영상 그리기
			// 반복문으로 image를 구성하는 data를 배열하는 방식
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					g.setColor(new Color(R[i][j], G[i][j], B[i][j]));
				    g.drawRect(20+j, 20+i, 1, 1);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
