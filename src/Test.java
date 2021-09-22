import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Test extends JFrame {
	public Test() {
		// TODO Auto-generated constructor stub
		Container ct = getContentPane();
		ct.setBackground(Color.WHITE);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Test Class");
		setSize(400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test();
	}

}
