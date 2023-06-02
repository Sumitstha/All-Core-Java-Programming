package menuPackage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
//import javax.swing.JSlider;
import javax.swing.KeyStroke;
//import javax.swing.event.ChangeEvent;
//import javax.swing.event.ChangeListener;

public class MenuDemonstration extends JFrame {
	JMenuBar bar;
	JMenu file,view;
	JMenuItem open,exit,color;
	JCheckBoxMenuItem status;
	
	public MenuDemonstration() {
		setTitle("Menu Frame (Sujan Shrestha)");
		bar= new JMenuBar();
		file= new JMenu("FILE");
		bar.add(file);
		open=new JMenuItem("Open");
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			new JFileChooser().showOpenDialog(MenuDemonstration.this);
				}
				});
		
		//save=new JMenuItem("Save");
		//save.setEnabled(false);//save garne button disabled hunxa
		
		
		
		exit=new JMenuItem("Exit",KeyEvent.VK_X);
		exit.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			System.exit(0);//exit hunxa 0 le
				}
				});
		
		view=new JMenu("VIEW");
		bar.add(view);
		color= new JMenuItem("Color");
		view.add(color);
		color.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			Color c=new JColorChooser().showDialog(MenuDemonstration.this,"select",Color.GREEN);
			bar.setBackground(c);
				}
				});
		
		
		file.add(open);
		//file.add(save);
		file.add(exit);
		
		
		setSize(300,300);
		setJMenuBar(bar);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuDemonstration();
	}

}
