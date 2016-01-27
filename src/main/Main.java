package main;

import java.io.IOException;
import java.net.UnknownHostException;

import gui.ClientGUI;
import gui.SelectionGUI;
import gui.ServerGUI;
import network.Client;
import network.Server;

public class Main {
	public static void main(String[] args){
		boolean server = (new SelectionGUI()).isServer();
		if(server){
			try {
				new ServerGUI();
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				new Server();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			String host = (new ClientGUI()).getHost();
			try {
				new Client(host);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
