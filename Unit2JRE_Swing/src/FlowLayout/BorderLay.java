package FlowLayout;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLay extends JFrame implements ActionListener{
	private JButton buttons[];
	private static final String[] names = {"Hide North","Hide South","Hide East","Hide West","Hide Center"};
	private BorderLayout layout;
	
	public BorderLay(){
		super("Border layout frame(Sujan Shrestha)");
		layout=new BorderLayout(5,5);
		setLayout(layout);
		buttons=new JButton[names.length];
		for(int count=0; count<names.length; count++){
			buttons[count]=new JButton(names[count]);
			buttons[count].addActionListener(this);
			}
		add(buttons[0],BorderLayout.NORTH);
		add(buttons[1],BorderLayout.SOUTH);
		add(buttons[2],BorderLayout.EAST);
		add(buttons[3],BorderLayout.WEST);
		add(buttons[4],BorderLayout.CENTER);
		}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(JButton button:buttons){//enhanced for loop[for each added buttons in a frame]
			if(e.getSource()==button){//if the clicked portion is button
			button.setVisible(false);//hide clicked buttons
			}
			else{
			button.setVisible(true);//show other buttons
			}
			}
	}
	
public static void main(String[] args) {
	// TODO Auto-generated method stub

}}
