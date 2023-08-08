import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {
	
	private JLabel la = new JLabel("c"); 
	private Container C = getContentPane();
	
	Main() {
		
		setTitle("Mouse Click random Position");
		C.setLayout(null);

		la.addMouseListener(new MyMouseAda());
		
		int x = (int)(Math.random()*400);
		int y = (int)(Math.random()*400);
		
		la.setSize(10, 10);
		la.setLocation(x, y);
		C.add(la);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	
	class MyMouseAda extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
			
			int x = (int)(Math.random()*(C.getWidth()-la.getWidth()));
			int y = (int)(Math.random()*(C.getHeight()-la.getHeight()));
			la.setLocation(x, y);
		}	
	}
}
