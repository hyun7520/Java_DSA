import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextMouseListener extends JFrame {
	private JLabel la = new JLabel("Han"); // �� ���� 
	private JTextField tf = new JTextField(); // �Է��� �ؽ�Ʈ �ʵ� ����
	
	public TextMouseListener() {
		setTitle("�ǽ����� Event ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container C = getContentPane();
		C.setLayout(null);
		setSize(400,400);
		setVisible(true);
		
		JLabel guide = new JLabel("�Է��� <Enter> ");
		guide.setSize(100,20);
		guide.setLocation(20,20);
		C.add(guide);
		
		la.setSize(50,20);
		la.setLocation(30,70);
		C.add(la); // �ʱ�� ��ġ����
		
		C.addMouseListener(new MouseAdapter() { //�͸� Ŭ������ �̺�Ʈ ���� �� ����Ʈ �ҿ� ����

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
				la.setLocation(e.getX(), e.getY()); // ����Ʈ ���� Ŭ�� �� �� ��ġ �̵�
			}
			
		});
		
		Action action = new AbstractAction()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		        la.setText(tf.getText());;
		    }
		};
		
		tf.addActionListener(action);
		tf.setSize(100,20);
		tf.setLocation(120, 20);
		C.add(tf); // �ؽ�Ʈ �ε� ��ġ ����
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextMouseListener();
	}

}
