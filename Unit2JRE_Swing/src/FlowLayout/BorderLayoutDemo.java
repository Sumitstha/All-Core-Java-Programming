package FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {
	JButton btn1, btn2, btn3, btn4,btn5;
	
	public BorderLayoutDemo() {
		setTitle("BorderLayout frame");
		setLayout(new BorderLayout(5,5));//horizontal gap, vertical gap
		btn1=new JButton("Button one");
		btn2=new JButton("Button two");
		btn3=new JButton("Button three");
		btn4=new JButton("Button four");
		btn5=new JButton("Button five");
		add(btn1,BorderLayout.NORTH);//at center
		add(btn2,BorderLayout.SOUTH);
		add(btn3,BorderLayout.EAST);
		add(btn4,BorderLayout.WEST);
		add(btn5);
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutDemo();
	}

}
