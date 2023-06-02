package TraceComponents;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextField;
//import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
//import javax.swing.plaf.basic.BasicSliderUI.ChangeHandler;

public class SliderDemonstration extends JFrame{
	JSlider slider;
	ChangeListener listener;
	JTextField tf;
	
	public SliderDemonstration() {
		// TODO Auto-generated constructor stub
		setTitle("Sujan Shrestha");
		setSize(300, 300);
		tf = new JTextField(20);
		add(tf, BorderLayout.SOUTH);
		listener = new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider s = (JSlider)e.getSource();
				tf.setText(String.valueOf(s.getValue()));
				
			}
		};
		
		slider = new JSlider(0, 100, 5);
		slider.addChangeListener(listener);
		slider.setMinorTickSpacing(0);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		add(slider, BorderLayout.NORTH);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SliderDemonstration();
	}

}