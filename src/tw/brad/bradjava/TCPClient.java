package tw.brad.bradjava;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		try {
			Socket socket = 
				new Socket(InetAddress.getByName("10.2.24.106"),
					7777);
			
			OutputStream out = socket.getOutputStream();
			out.write("Hello, Brad".getBytes());
			out.flush();
			out.close();
			
			socket.close();
		} catch (IOException e) {
			
		}
	}

}
