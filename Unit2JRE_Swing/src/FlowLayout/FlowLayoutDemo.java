package FlowLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame {
	JButton btn1, btn2, btn3, btn4;
	public FlowLayoutDemo() {
		setTitle("Flowlayout Frame");
		setSize(300,400);
		//setLayout(new FlowLayout());
		
		btn1=new JButton("Button one");
		btn1.setBackground(Color.GREEN);
		btn1.setForeground(Color.BLACK);
		btn2=new JButton("Button two");
		btn3=new JButton("Button three");
		btn4=new JButton("Button four");
		add(btn1);//at center
		add(btn2);
		add(btn3);
		add(btn4);
		
		setLayout(new FlowLayout());
		setVisible(true);//default false
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutDemo();
	}

}
