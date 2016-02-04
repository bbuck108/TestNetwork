package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import gui.OutputGUI;

public class Client {
	Socket socket;
	DataInputStream in;
	DataOutputStream out;
	private OutputGUI outputWindow;
	public Client(String host) throws UnknownHostException, IOException{
		socket = new Socket(host ,80);
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
		outputWindow = new OutputGUI();
		while(true){
			outputWindow.addMessage(in.readUTF());
		}
	}
}
