package FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame {
JButton btn1, btn2, btn3, btn4,btn5;
	
	public GridLayoutDemo() {
		setTitle("GridLayout frame");
		setLayout(new GridLayout(3,2,16,20));//3 rows, 2 column, 5 h-gap, 3-vertical gap
		btn1=new JButton("Colour change when click");
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btn1.setBackground(Color.blue);
				btn1.setText("Magic");
				btn1.setBackground(Color.cyan);
			}
			
		});
		btn2=new JButton("Button two");
		btn3=new JButton("Button three");
		btn4=new JButton("Button four");
		btn5=new JButton("EXIT");
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		
		});
			
		
		add(btn1);//at center
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutDemo();
	}

}
