import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyFrame() {
		setTitle("���� GUI ����");
		
		//����Ʈ��
		//source -> organize import�� ����Ʈ �� ���� ����
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new Button("OK")); //����� �ٸ���
		cp.add(new JButton("Cancel"));
		cp.add(new JButton("Ignore"));
		
		/*
		cp.add(new JButton("OK"), BorderLayout.WEST);
		cp.add(new JButton("Cancel"), BorderLayout.CENTER);
		cp.add(new JButton("Ignore"), BorderLayout.EAST);
		*/
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame();
		
		

	}

}
