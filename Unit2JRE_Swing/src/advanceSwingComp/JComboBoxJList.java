package advanceSwingComp;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;


public class JComboBoxJList extends JFrame{
	JList<String> list;
	JComboBox<String> country;

	public JComboBoxJList() {
		setTitle("Sumit Shrestha");
		setSize(400,400);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		String[] subjects= {"Java","SPM	","POM","PROJECT","DWDM"};
		list=new JList<String>(subjects);
		list.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		add(list);
		
		String[]names= {"Nepal","India","China"};
		country= new JComboBox<String>(names);
		
		country.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(
						JComboBoxJList.this,country.getSelectedItem()+" is a country");
			}
		});
		add(country);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new JComboBoxJList();
	}

}
