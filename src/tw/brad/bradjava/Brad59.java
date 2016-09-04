package tw.brad.bradjava;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Brad59 {
	// Sender
	public static void main(String[] args) {
		String data = "大家好, 偶素Brad v2";
		byte[] sendData = data.getBytes();
		try {
			DatagramSocket socket = 
				new DatagramSocket();
			DatagramPacket packet = 
				new DatagramPacket(sendData,sendData.length,
						InetAddress.getByName("10.2.24.255"), 
						8888);
			socket.send(packet);
			socket.close();
			System.out.println("Send OK");
		} catch (SocketException e) {
			
		} catch (UnknownHostException e) {
			
		} catch (IOException e) {
		}
		
	}

}
