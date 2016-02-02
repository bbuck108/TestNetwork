package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import gui.InputGUI;

public class Server {
	ServerSocket serverSocket;
	Socket socket;
	DataInputStream in;
	DataOutputStream out;
	ArrayList<String> messages;
	public Server() throws IOException{
		messages = new ArrayList();
		serverSocket = new ServerSocket(80);
		socket = serverSocket.accept();
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
		out.writeUTF("Thank you for connecting to the server!");
		new InputGUI(this);
		while(true){
			try{
				out.writeUTF(messages.get(0));
				messages.remove(0);
			}catch (IndexOutOfBoundsException e){
				
			}
			
		}
	}
	public void addToList(String p_1){
		messages.add(p_1);
	}
}
