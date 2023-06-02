package TraceComponents;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class RadioCheckboxCombo extends JFrame {
	JRadioButton male,female,notspecified;
	JCheckBox csit, bca,bbm;
	JComboBox<String> country;//Generic type
	ButtonGroup group;
	
	public RadioCheckboxCombo() {
		setTitle("choice Frame");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//Radiobutton's objects
		male=new JRadioButton("Male");
		female=new JRadioButton("female");
		notspecified=new JRadioButton("Not Specified");
		
		group=new ButtonGroup();
		group.add(male);
		group.add(female);
		group.add(notspecified);
		
		csit=new JCheckBox("BscCsit");
		bca=new JCheckBox("BCA");
		bbm=new JCheckBox("BBM");
		String[]names= {"Nepal","India","China"};
		country= new JComboBox<String>(names);
		
		male.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(
						RadioCheckboxCombo.this,male.getSelectedIcon()+"male");
				
			}
		});
		
		country.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(
						RadioCheckboxCombo.this,country.getSelectedItem()+" is a country");
			}
		});
		
		//adding components to jframe
		add(male);
		add(female);
		add(notspecified);
		add(csit);
		add(bca);
		add(bbm);
		add(country);
		
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new RadioCheckboxCombo();
	}

}
