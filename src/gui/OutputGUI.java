package gui;

import java.awt.BorderLayout;
import java.util.ArrayList;

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

	public OutputGUI(ArrayList<String> outputArray) {
		setSize(240,240);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		while(true){
			try{
				String t_1=outputArray.get(0);
				outputArray.remove(0);
				JLabel lblTheHostName = new JLabel(t_1);
				getContentPane().add(lblTheHostName, BorderLayout.CENTER);
			}catch(IndexOutOfBoundsException e){
				
			}
		}
	}

}
