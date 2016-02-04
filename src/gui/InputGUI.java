package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import network.Server;

public class InputGUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8353624308759738454L;
	
	public InputGUI(Server p_1){

		setSize(240,240);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		JTextField lblTheHostName = new JTextField();
		lblTheHostName.setColumns(15);
		panel.add(lblTheHostName);
		
		JButton enter = new JButton("enter");
		panel_1.add(enter);
		enter.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					p_1.addToList(lblTheHostName.getText());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		});
		
		
		setVisible(true);
		
	}

}
