package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MyFrame extends JFrame {
	
	private	Roulette p_one = null;
	private Calculator p_two = null;
	private Information p_three = null;
	private Record p_four = null;
	private JPanel panel=null;
	
	public MyFrame() {
		setTitle("frame test");	
		
		p_one = new Roulette(this);
		p_two = new Calculator(this);
		p_three = new Information(this);
		p_four = new Record(this);
		
		JTabbedPane jtab = new JTabbedPane();
		
		jtab.addTab("One", p_one);
		jtab.addTab("Two", p_two);
		jtab.addTab("Three", p_three);
		jtab.addTab("Four", p_four);
		
		add(jtab);
		
//		JButton jb = new JButton("start");
//		panel = new JPanel();
//		panel.add(jb);
//		add(panel, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500	, 978);
//		setResizable(false);

		setVisible(true);
	}

}
