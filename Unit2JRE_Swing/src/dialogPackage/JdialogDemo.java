package dialogPackage;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Detail extends JDialog{
	JLabel info;
	public Detail(JFrame owner) {
		super(owner, true);//pop on jframe and jframe is deactivated
		setSize(300,100);
		info= new JLabel("<html><h2>My name is SUMIT SHRESTHA</h2></html>") ;
		add(info);
		setVisible(true);
		
	}
}

public class JdialogDemo extends JFrame{
	JButton click;
	public JdialogDemo() {
		setTitle("JDialog Frame");
		click =new JButton("Detail");
		click.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Detail(JdialogDemo.this);//Jframe's reference
			}
		});
		setSize(300,300);
		add(click, BorderLayout.NORTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JdialogDemo();
	}

}
