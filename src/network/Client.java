package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import gui.OutputGUI;

public class Client {
	Socket socket;
	DataInputStream in;
	DataOutputStream out;
	private OutputGUI outputWindow;
	private ArrayList<String> outputArray;
	public Client(String host) throws UnknownHostException, IOException{
		socket = new Socket(host ,80);
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
		outputArray = new ArrayList<String>();
		outputWindow = new OutputGUI(outputArray);
		while(true){
			outputArray.add(in.readUTF());
		}
	}
}
