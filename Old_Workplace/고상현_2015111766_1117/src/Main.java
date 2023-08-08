import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	
	Main() {
		setTitle("실습문제 11-17");
		
		Panel panel = new Panel();
		setContentPane(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		
	}
	
	class Panel extends JPanel { // 사용자가 그래칙을 통해 다양한 UI를 창출하는 일종의 캔버스 JPanel
		private int[] x = new int[100];
		private int[] y = new int[100];
		private int cnt = 0;
		
		public Panel() {
			
			addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mousePressed(e);
					x[cnt] = e.getX();
					y[cnt++] = e.getY();
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseReleased(e);
					x[cnt] = e.getX();
					y[cnt++] = e.getY();
					repaint();
				}
				
			});
		}

		@Override
		protected void paintComponent(Graphics g) { //Graphics를 이용하여 페다각형 만드는 코드
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(new Color(180,50,255));
			g.drawPolygon(x,y,cnt);
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Main();
		
	}

}
