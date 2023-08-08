import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JFrame {
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7, 20);
	
	Main() {
		setTitle("텍스트 입력 실습");
		Container C = getContentPane();
		C.setLayout(new FlowLayout());
		
		C.add(new JLabel("입력 후 엔터키를 누르세요"));
		C.add(tf);
		C.add(ta);
		
		tf.addActionListener(new ActionListener( ) {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ta.append(tf.getText() + "\n");
				// 여기까지 할 경우 매번 텍스트를 지우고 해야함
				tf.setText("");
				// 텍스트 입력 후 자동으로 지워지도록
			}
			
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,300);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
		
	}

}
