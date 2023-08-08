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
	private JLabel la = new JLabel("Han"); // 라벨 생성 
	private JTextField tf = new JTextField(); // 입력할 텍스트 필드 생성
	
	public TextMouseListener() {
		setTitle("실습과제 Event 응용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container C = getContentPane();
		C.setLayout(null);
		setSize(400,400);
		setVisible(true);
		
		JLabel guide = new JLabel("입력후 <Enter> ");
		guide.setSize(100,20);
		guide.setLocation(20,20);
		C.add(guide);
		
		la.setSize(50,20);
		la.setLocation(30,70);
		C.add(la); // 초기라벨 위치지정
		
		C.addMouseListener(new MouseAdapter() { //익명 클래스로 이벤트 생성 후 컨텐트 팬에 연결

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
				la.setLocation(e.getX(), e.getY()); // 컨텐트 내부 클릭 시 라벨 위치 이동
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
		C.add(tf); // 텍스트 핑드 위치 지정
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextMouseListener();
	}

}
