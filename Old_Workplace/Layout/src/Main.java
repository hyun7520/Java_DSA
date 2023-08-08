import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {
	
	Main() {
		setTitle("배치관리자 실습");
		
		Container C = getContentPane();
		
		C.setLayout(null);
		
		JButton bt = new JButton("Action");
		bt.setLocation(100, 100);
		bt.setSize(80, 30);
		bt.setBackground(Color.YELLOW);
		
		bt.addActionListener(new ActionListener() {

			@Override //source -> override
			public void actionPerformed(ActionEvent e) { // 이벤트 객체
				// TODO Auto-generated method stub
				// 해야할 일
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
			}
		});
		
		C.add(bt);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

/*
// 독립클래스로 Listener
class MyActionLi implements ActionListener {

	@Override //source -> override
	public void actionPerformed(ActionEvent e) { // 이벤트 객체
		// TODO Auto-generated method stub
		// 해야할 일
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
}
*/
