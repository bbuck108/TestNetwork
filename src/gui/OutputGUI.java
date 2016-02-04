package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OutputGUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8353624308759738454L;
	JPanel panel;
	
	public OutputGUI(String p_1){

		setSize(240,240);
		
		JLabel lblTheHostName = new JLabel(p_1);
		getContentPane().add(lblTheHostName, BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public OutputGUI() {
		setSize(240,240);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);

	}
	public void addMessage(String p_1){
		JLabel t_1 = new JLabel(p_1);
		panel.add(t_1);
		validate();
		repaint();
	}

}
