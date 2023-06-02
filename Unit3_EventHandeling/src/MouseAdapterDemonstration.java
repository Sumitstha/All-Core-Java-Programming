import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterDemonstration extends MouseAdapter {
JFrame frame;
JLabel info;
public MouseAdapterDemonstration() {
	frame=new JFrame("Adapter Frame");
	info=new JLabel();
	frame.add(info, BorderLayout.NORTH);
	frame.setSize(300,300);
	frame.addMouseListener(this);
	frame.setVisible(true);
	
}
	
	@Override
	public void mouseClicked(MouseEvent event)
{
		info.setText("Clicked at:("+event.getX()+","+event.getY()+").");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseAdapterDemonstration();

	}

}
