package gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator extends JPanel {
	private JLabel lbNewLabel;
	private JButton btnNewButton;
	private MyFrame F;
	
	public Calculator(MyFrame f) {
		setBackground(Color.orange);
		setLayout(null);
		
		F = f;
		
		lbNewLabel = new JLabel("Calculator Panel");
		lbNewLabel.setBounds(12, 10, 400, 15);
		add(lbNewLabel);
		
		btnNewButton = new JButton("Button");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				F.changePanel();
//			}
//		});
		btnNewButton.setBounds(12, 35, 113, 23);
		add(btnNewButton);
		
		setVisible(true);
	}
}
