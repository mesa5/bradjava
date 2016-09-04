package tw.brad.bradjava;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Brad58 {

	public static void main(String[] args) {
		try{
			InetAddress[] ips = 
				InetAddress.getAllByName("www.facebook.com");
			for (InetAddress ip : ips){
				System.out.println(ip.getHostAddress());
			}
		}catch(UnknownHostException ue){
			System.out.println("X");
		}
	}

}
