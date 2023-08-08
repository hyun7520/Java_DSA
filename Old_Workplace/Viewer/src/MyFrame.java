import java.awt.Color;
import java.awt.Graphics;
import java.io.FileInputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	
	MyFrame() {
		setTitle("영상 뷰어 실습");
		setContentPane(new MyPanel());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			// 1. File Read
			int data[] = new int[500*500];
			int W =256;
			int H =256;
			int n = 0, temp;
			
			FileInputStream fin;
			
			try {
				fin = new FileInputStream("C:\\Temp\\GIRL.dat");
				while( (temp=fin.read()) != -1 ) {
					data[n++] = temp;
				}
				
				fin.close();
			} catch (Exception e) {
				System.out.println("파일 읽기 오류");
			}
			// 2. 1차원배열 -> 2차원배열
			int bright = 0;
			int pix[][] = new int[300][300];
			for(int i = 0;i < H; i++) {
				for(int j = 0; j < W; j++) {
					pix[i][j] = 255 - data[i*W+j] + bright;
					if(pix[i][j]>255)
						pix[i][j]=255;
				}
			}
			
			// 3. GUI Graphic 출력
			for(int i = 0;i < H; i++) {
				for(int j = 0; j < W; j++) {
					g.setColor(new Color(pix[i][j],pix[i][j],pix[i][j]));
					g.drawOval(20+j, 20+i, 1, 1);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
