import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventDemonstration extends JFrame implements MouseListener{
	JLabel infolbl;
	
	public MouseEventDemonstration() {
		setTitle("Mouse Frame");
		infolbl=new JLabel();
		add(infolbl, BorderLayout.NORTH);
		addMouseListener(this);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new MouseEventDemonstration();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		infolbl.setText("Clicked at:("+e.getX()+","+e.getY()+").");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		infolbl.setText("Pressed at:("+e.getX()+","+e.getY()+").");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		infolbl.setText("Released at:("+e.getX()+","+e.getY()+").");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		infolbl.setText("Entered at:("+e.getX()+","+e.getY()+").");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		infolbl.setText("Exited at:("+e.getX()+","+e.getY()+").");
	}

}
