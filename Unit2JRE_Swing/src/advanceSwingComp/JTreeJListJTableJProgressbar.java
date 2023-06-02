package advanceSwingComp;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeJListJTableJProgressbar extends JFrame{
	//JTree tree;
	//JList<String> list;
	//JTable table;
	JProgressBar bar;
	
	public JTreeJListJTableJProgressbar() {
		setTitle("Sumit Shrestha");
		setSize(400,200);
		setLayout(new FlowLayout(FlowLayout.LEFT));
//		String[] subjects= {"Java","SPM	","POM","PROJECT","DWDM"};
//		list=new JList<String>(subjects);
//		list.setBorder(BorderFactory.createLineBorder(Color.BLUE));
//		add(list);
//		DefaultMutableTreeNode root= new DefaultMutableTreeNode("ROOT");
//		DefaultMutableTreeNode animal= new DefaultMutableTreeNode("ANIMAL");
//		DefaultMutableTreeNode bird= new DefaultMutableTreeNode("BIRD");
//		root.add(bird);
//		root.add(animal);
//		tree=new JTree(root);
//		add(tree);
//		
//		String[] head= {"Name","College	","Address"};
//		String[][] data= {
//				{"Sujan","Ambition","Baneshwor"},
//				{"Priyanshu","Ambition","Siphal"},
//				{"Ujjwal","Ambition","Bhaktapur"},
//		};
//		
//	table=new JTable(data,head);
//	JScrollPane pane=new JScrollPane(table);
//	add(pane);
	
	bar= new JProgressBar();
	JButton btn=new JButton("Status");
	
	btn.addActionListener(new ActionListener() {
		int count=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			count+=10;
			bar.setValue(count);
			if(count>90)
				bar.setString("Completed");
		}
	});
	add(bar);
	add(btn);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new JTreeJListJTableJProgressbar();
	}

}
