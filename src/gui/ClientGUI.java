package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JPanel;

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
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblEnterHostName = new JLabel("Enter host name:");
		panel.add(lblEnterHostName);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		
		txtHost = new JTextField();
		panel_1.add(txtHost);
		txtHost.setColumns(15);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		
		JButton btnSelect = new JButton("Enter");
		panel_2.add(btnSelect);
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
