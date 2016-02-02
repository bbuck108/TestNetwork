package gui;

import java.awt.BorderLayout;
import java.net.Inet4Address;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ServerGUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8353624308759738454L;
	
	public ServerGUI() throws UnknownHostException{

		setSize(240,240);
		
		JLabel lblTheHostName = new JLabel("The host name is: "+(Inet4Address.getLocalHost().getHostAddress()));
		getContentPane().add(lblTheHostName, BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
