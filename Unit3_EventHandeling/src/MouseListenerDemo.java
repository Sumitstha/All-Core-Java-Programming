import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
public class MouseListenerDemo extends MouseAdapter {
 Label l;
 JFrame frame;
 MouseListenerDemo() {
 frame=new JFrame();
 frame.addMouseListener(this);
 l = new Label();
 l.setBounds(20, 50, 100, 20);
 frame.add(l);
 frame.setTitle("Sujan Shrestha");
 frame.setSize(300,300);
 frame.setLayout(null);
 frame.setVisible(true);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public void mouseClicked(MouseEvent e) {
 l.setText("Mouse Clicked");
 }
 public void mouseEntered(MouseEvent e) {
 l.setText("Mouse Entered");
 }
 public void mouseExited(MouseEvent e) {
 l.setText("Mouse Exited");
 }
//Here we have commented one overridden method and still the program executes
 // public void mousePressed(MouseEvent e) {
 // l.setText("Mouse Pressed");
 // }
 public void mouseReleased(MouseEvent e) {
 l.setText("Mouse Released");
 }
 public static void main(String[] args) {
 new MouseListenerDemo();
 }
}


