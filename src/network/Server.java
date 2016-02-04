package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import gui.InputGUI;

public class Server {
	ServerSocket serverSocket;
	Socket socket;
	DataInputStream in;
	DataOutputStream out;
	public Server() throws IOException{
		serverSocket = new ServerSocket(80);
		socket = serverSocket.accept();
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
		out.writeUTF("Thank you for connecting to the server!");
		new InputGUI(this);
	}
	public void addToList(String p_1) throws IOException{
		out.writeUTF(p_1);
	}
}
