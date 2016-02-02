package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class OutputGUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8353624308759738454L;
	
	public OutputGUI(String p_1){

		setSize(240,240);
		
		JLabel lblTheHostName = new JLabel(p_1);
		getContentPane().add(lblTheHostName, BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
