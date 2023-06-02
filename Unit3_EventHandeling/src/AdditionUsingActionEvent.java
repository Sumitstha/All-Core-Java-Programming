import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AdditionUsingActionEvent extends JFrame implements ActionListener{
	JLabel i1,i2,i3;
	JTextField t1,t2,t3;
	JButton add,sub;
	
	public AdditionUsingActionEvent() {
		setTitle("Addition and Subtraction");
		setSize(500,500);
		setLayout(new GridLayout(4,2,5,5));
		i1=new JLabel("First Number");
		i2=new JLabel("Second Number");
		i3=new JLabel("Result");
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		add=new JButton("Addition");//default action command in addition
		add.setActionCommand("A");//we can use +
		add.addActionListener(this);
		sub=new JButton("Subtraction");//default action command in addition
		sub.setActionCommand("S");//we can use +
		sub.addActionListener(this);
		//
		add(firstlbl);
		add(secondlbl);
		add(resultlbl);
		add(firsttxt);
		add(secondtxt);
		add(resulttxt);
		add(add);
		add(sub);
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int f,s,r=0;
			f=Integer.parseInt(firsttxt.getText());//string to int
			s=Integer.parseInt(secondtxt.getText());//string to int
			if(e.getActionCommand()=="A") {
				r=f+s;
			}
			if(e.getActionCommand()=="S") {
				r=f-s;
			}
			resulttxt.setText(String.valueOf(r));//int to string
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new AdditionUsingActionEvent();
	}

}
