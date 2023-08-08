import java.awt.Color;
import java.awt.Graphics;
import java.io.FileInputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	
	Main(){
		setTitle("�÷����� ���");
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
			
			// 1. ���̳ʸ� ���� ���� : �̹���
			int data[] = new int[600*2000]; // ������ ������ �迭 ����
			int H, W;
			int n = 0, temp;
			// H = 256;   //girl.raw
			// W = 256;
			H = 512; // ����
			W = 512; // ����
			// H = 380    //Kim.raw
			// W = 380
			
			int colorW = W*3; // �÷��� ��� 1pixel = 3bite �̹Ƿ� W�� 3�� �÷��ش�
			
			FileInputStream fin;
			
			try { // ���� �о����
				fin = new FileInputStream("C:\\Temp\\barbara.raw");
				while( (temp=fin.read()) != -1 ) {
					data[n++] = temp;
				}
				fin.close();
			} catch (Exception e) {
				System.out.println("�����б� ����");
				return;
			}
			
			// 2. 1�����迭 -> 2�����迭 ��ȯ
			int R[][] = new int[600][600]; // R
			int G[][] = new int[600][600]; // G
			int B[][] = new int[600][600]; // B
			
			
			
			for(int i = 0;i < H; i++) { // ����
				for(int j = 0; j < colorW; j++) { // ����
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
			// 3. ȭ�鿡 ���� �׸���
			// �ݺ������� image�� �����ϴ� data�� �迭�ϴ� ���
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
