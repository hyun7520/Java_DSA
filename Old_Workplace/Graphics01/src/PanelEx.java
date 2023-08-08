import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelEx extends JFrame {
	
	PanelEx() {
		setTitle("그래픽 실습");
		
		//setContentPane( new Mypanel());
		
		Container c = getContentPane();
		c.add(new Northpanel(), BorderLayout.NORTH);
		c.add(new Mypanel(), BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}
	
	class Northpanel extends JPanel {
		Northpanel() {
			this.setBackground(Color.GREEN);
			
			add(new JButton("버튼 눌러요"));
		}
	
	}
	
	class Mypanel extends JPanel {
		Point[] start = new Point[100]; 
		Point[] end = new Point[100]; 
		int cnt;
		
		//private int status = 0;
		
		Mypanel() {
			cnt = 0;
			this.setBackground(Color.YELLOW);
			
			addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mousePressed(e);
					start[cnt] = e.getPoint();
					//status = 1;
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseReleased(e);
					end[cnt++] = e.getPoint();
					repaint();  // 화면을 다시 그려주세요. Event발생-> 실시간으로 그려짐
				}
				
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			for(int i = 0; i < cnt; i++) {
				g.drawLine((int)start[i].getX(), (int)start[i].getY(), 
						(int)end[i].getX(), (int)end[i].getY());
			}
			//g.drawLine(20, 20, 80, 120);
			//g.drawRect(20, 20, 60, 70);
			//g.setColor(Color.RED);
			//g.fillOval(50, 50, 80, 60);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new PanelEx();
	}

}
