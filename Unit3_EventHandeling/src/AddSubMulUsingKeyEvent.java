import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddSubMulUsingKeyEvent extends JFrame implements KeyListener {
	JLabel i1, i2, i3;
	JTextField t1, t2, t3;

	public AddSubMulUsingKeyEvent() {
		setTitle("Addition and Subtraction and Multiplication");
		setSize(500, 500);
		setLayout(new GridLayout(3, 2, 5, 5));

		i1 = new JLabel("First Number");
		i2 = new JLabel("Second Number");
		i3 = new JLabel("Result");

		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t3.addKeyListener(this);

		//
		add(i1);
		add(t1);
		add(i2);
		add(t2);
		add(i3);
		add(t3);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		int f, s, r = 0;
		f = Integer.parseInt(t1.getText());// string to int
		s = Integer.parseInt(t2.getText());// string to int
		if (e.getKeyChar() == 'a') {
			r = f + s;
		} else if (e.getKeyChar() == 's') {
			r = f - s;
		} else {
			r = f * s;
		}
		t3.setText(String.valueOf(r));// int to string
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AddSubMulUsingKeyEvent();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
