package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;

public class ClientGUI extends JFrame{
	String host;
	boolean done;
	/**
	 * 
	 */
	private static final long serialVersionUID = -8353624308759738454L;
	private JTextField txtHost;
	
	public ClientGUI(){
		ClientGUI window = this;
		
		
		JButton btnSelect = new JButton("Enter");
		getContentPane().add(btnSelect, BorderLayout.SOUTH);
		
		JLabel lblEnterHostName = new JLabel("Enter host name:");
		getContentPane().add(lblEnterHostName, BorderLayout.NORTH);
		
		txtHost = new JTextField();
		txtHost.setMaximumSize(new Dimension(2147483647, 20));
		getContentPane().add(txtHost, BorderLayout.CENTER);
		txtHost.setColumns(10);
		btnSelect.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				host = txtHost.getText();
				done = true;
				window.dispose();
				
			}
			
		});
		setSize(240,240);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public String getHost() {
		// TODO Auto-generated method stub
		while(!done){
			
		}
		return host;
	}

}
