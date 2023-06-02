package dialogPackage;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class MultipleDesktopInterface extends JFrame{
	JDesktopPane desktop;
	JInternalFrame frame1,fram2,fram3;
	
	public MultipleDesktopInterface() {
		setSize(500,600);
		setTitle("MDI frame");
		desktop= new JDesktopPane();
		add(desktop);
		frame1= new JInternalFrame("Frame One",true,true,true,true);//(true-resizeable,true-closable,true-maximizable,true-minimizable
		frame1.setSize(200,200);
		frame1.setLocation(10,10);//desktop position
		frame1.setVisible(true);
		desktop.add(frame1);
		
		fram2= new JInternalFrame("Frame Two",true,true,true,true);//(true-resizeable,true-closable,true-maximizable,true-minimizable
		fram2.setSize(200,200);
		fram2.setLocation(250,10);//desktop position
		fram2.setVisible(true);
		desktop.add(fram2);
		setVisible(true);
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultipleDesktopInterface();
	}

}
