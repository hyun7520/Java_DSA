import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MEvent extends JFrame {
	
	MEvent() {
		setTitle("Mouse Event 실습");
		
		Container C = getContentPane();
		C.setLayout(null);
		
		// Listen 등록
		C.addMouseListener(new MyMouseLi());
		
		JLabel la = new JLabel("Hello"); 
		la.setSize(50, 20);
		la.setLocation(30, 30);
		C.add(la);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MEvent();
	}
	
	// Adapter 클래스
	class MyMouseAda extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mousePressed(e);
			
			Point p = e.getPoint();
			la.setLocation(p);
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseEntered(e);
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
	
		
	}

}

class MyMouseLi implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//int x = e.getX();
		//int y = e.getY();
		Point p = e.getPoint();
		la.setLocation(100, 100);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}