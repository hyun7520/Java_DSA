import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {
	
	Color[] m_col = { Color.red, Color.ORANGE, Color.yellow, Color.green,
			Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
			Color.PINK, Color.LIGHT_GRAY};
	
	Main() {
		setTitle("10 colors button");
		
		Container C = getContentPane();
		
		C.setLayout(new GridLayout());
		
		JButton[] xylo = new JButton[10];
		
		String num;
		
		for(int i = 0; i < 10; i++) {
			num = Integer.toString(i);
			xylo[i] = new JButton(num);
			xylo[i].setBackground(m_col[i]);
			C.add(xylo[i]);
		}
		
		for(int i = 0; i< 10; i++) {
			xylo[i].addActionListener(new MyActionLi());
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setVisible(true);
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	class MyActionLi implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();	
			if(b.getText().equals(b.getText())) {
				b.setBackground(Color.WHITE);
			}		
		}
	}
}
