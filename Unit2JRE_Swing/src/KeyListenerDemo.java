import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class KeyListenerDemo extends JFrame implements KeyListener {
    private JTextField t1, t2, t3;
    private JLabel l1, l2, l3;
    private JButton b;

    KeyListenerDemo() {
        super("Handling Key Event");
        l1 = new JLabel("First Value");
        t1 = new JTextField(10);
        l2 = new JLabel("Second Value");
        t2 = new JTextField(10);
        l3 = new JLabel("Result");
        t3 = new JTextField(10);
        b = new JButton("Calculate");
        b.addKeyListener(this); // calculate button is clicked to activate Key Listener
        setLayout(new FlowLayout());
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        setSize(170, 300);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int x, y, z;
        try {
            x = Integer.parseInt(t1.getText());
            y = Integer.parseInt(t2.getText());
        } catch (NumberFormatException e) {
            t3.setText("Invalid input");
            return;
        }

        if (ke.getKeyChar() == 'a') {
            z = x + y;
        } else if (ke.getKeyChar() == 's') {
            z = x - y;
        } else {
            t3.setText("Press A or S");
            return;
        }
        t3.setText(String.valueOf(z));
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        
    }

    public static void main(String[] args) {
        new KeyListenerDemo();
    }
}
