import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventHandelingProcedure extends JFrame{
JButton exit;

public EventHandelingProcedure() {
	setTitle("Event Frame");
	setSize(300,300);
	exit=new JButton ("EXIT");
	
	//using anonymous inner class
//	exit.addActionListener(new ActionListener() {
//		@Override
//		public void ActionPerformed(ActionEvent e) {
//			System.exit(0);
//		}
//	};
	exit.addActionListener(this);
	add(exit,BorderLayout.NORTH);
	
	
	setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new EventHandelingProcedure();
	}

}
