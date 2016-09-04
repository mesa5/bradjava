package tw.brad.bradjava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) {
		// 1. read from local filesystem
		long start = System.currentTimeMillis();
		try {
			Socket client = 
				new Socket(InetAddress.getByName("10.2.24.119"), 
						6666);
			BufferedOutputStream bout = 
				new BufferedOutputStream(client.getOutputStream());
			BufferedInputStream bin = 
				new BufferedInputStream(
					new FileInputStream("dir1/coffee.jpg"));
			int b;
			while ( (b = bin.read()) != -1){
				bout.write(b);
			}
			
			bin.close();
			bout.flush();
			bout.close();
			client.close();
			System.out.println(System.currentTimeMillis() - start);
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
	}
}
