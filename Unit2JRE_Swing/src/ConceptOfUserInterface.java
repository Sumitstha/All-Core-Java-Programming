//import javax.swing.JFrame;
//public class ConceptOfUserInterface {
//	public ConceptOfUserInterface() {
//		JFrame frame=new JFrame();
//		frame.setTitle("Concept Frame");
//		frame.setSize(300,300);//300 pixels, 300 pixels
//		frame.setVisible(true);//default false
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//jframe close huda console ma ni close hunxa
//		frame.setResizable(false);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new ConceptOfUserInterface();
//	}
//
//}

//ALTERNATIVE WAY USING INHERITANCE

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class ConceptOfUserInterface extends JFrame {
	
	JTextField usernametxt;
	JLabel usernamelbl, passlbl;
	JPasswordField passtxt;
	JButton btn;
	
	public ConceptOfUserInterface() {
//		JFrame frame=new JFrame();
		setTitle("Concept Frame");
		setLayout(null);//Default BorderLayout is not active.yo gare paxi aafno custom location ma widget rakhna milxa
		usernamelbl=new JLabel("Username");
		usernamelbl.setBounds(20,10,100,20);//setBound(x,y,width,height)
		add(usernamelbl);
		usernametxt=new JTextField(20);
		usernametxt.setBounds(120,10,100,20);
		add(usernametxt);
		
		passlbl=new JLabel("Password");
		passlbl.setBounds(20,40,100,20);//setBound(x,y,width,height)
		add(passlbl);
		passtxt=new JPasswordField(20);
		passtxt.setBounds(120,40,100,20);
		add(passtxt);
		
		btn=new JButton("Submit");
		btn.setBounds(120,80,100,20);
		add(btn);
		
		
		setSize(300,300);//300 pixels, 300 pixels
		setVisible(true);//default false
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//jframe close huda console ma ni close hunxa
		setResizable(false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConceptOfUserInterface();
	}

}
