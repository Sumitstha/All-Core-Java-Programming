package FlowLayout;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

//import javax.swing.JButton;
//import javax.swing.JFrame;
import javax.swing.*;

public class GridBagLayoutDemo extends JFrame{
	JButton btn1,btn2,btn3,btn4,btn5;
	GridBagConstraints gbc;
	
	public GridBagLayoutDemo() {
		setTitle("GridBag Frame");
		setSize(650,400);
		setLayout(new GridBagLayout());
		gbc=new GridBagConstraints();
		gbc.insets=new Insets(5,5,5,5);//provides space between components (top,left,bottom,right)
		
		btn1=new JButton("Button one");
		btn1.setBackground(Color.blue);
		gbc.gridx=0;//value of column
		gbc.gridy=0;//value of row
		gbc.gridheight=5;
		gbc.fill= GridBagConstraints.VERTICAL;
		add(btn1,gbc);//adds button to 0,0 position
		
		btn2=new JButton("Button two");
		btn2.setBackground(Color.cyan);
		gbc.gridx=1;//value of column
		gbc.gridy=1;//value of row
		//gbc.gridheight=1;
		//gbc.gridwidth=2;
		add(btn2,gbc);
		
		btn3=new JButton("Button three");
		btn3.setBackground(Color.yellow);
		gbc.gridx=2;//value of column
		gbc.gridy=2;//value of row
		//gbc.gridwidth=3;
		//gbc.gridheight=1;
		add(btn3,gbc);//adds button to 0,0 position
		
		btn4=new JButton("Button four");
		btn4.setBackground(Color.orange);
		gbc.gridx=3;//value of column
		gbc.gridy=3;//value of row
		//gbc.gridwidth=1;
		//gbc.gridheight=1;
		add(btn4,gbc);
		
		btn5=new JButton("Button five");
		btn5.setBackground(Color.green);
		gbc.gridx=1;//value of column
		gbc.gridy=4;//value of row
		gbc.gridwidth=1;
		gbc.gridheight=3;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		add(btn5,gbc);
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridBagLayoutDemo();
	}

}
