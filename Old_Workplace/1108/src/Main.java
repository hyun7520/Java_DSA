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
		setTitle("�ؽ�Ʈ �Է� �ǽ�");
		Container C = getContentPane();
		C.setLayout(new FlowLayout());
		
		C.add(new JLabel("�Է� �� ����Ű�� ��������"));
		C.add(tf);
		C.add(ta);
		
		tf.addActionListener(new ActionListener( ) {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ta.append(tf.getText() + "\n");
				// ������� �� ��� �Ź� �ؽ�Ʈ�� ����� �ؾ���
				tf.setText("");
				// �ؽ�Ʈ �Է� �� �ڵ����� ����������
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
