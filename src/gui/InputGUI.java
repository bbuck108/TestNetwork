package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
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
		JTextField lblTheHostName = new JTextField();
		getContentPane().add(lblTheHostName);
		setVisible(true);
		
		JButton enter = new JButton("enter");
		enter.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				p_1.addToList(lblTheHostName.getText());
			}
			
		});
		getContentPane().add(enter, BorderLayout.SOUTH);
		
	}

}
