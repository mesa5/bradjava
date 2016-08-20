package tw.brad.bradjava;

import javax.swing.JFrame;

public class Brad09 {
	public static void main(String[] args) {
		// switch
		int dir = 0;	// 0:STOP; 1:LEFT; 2:RIGHT, ...
		final int b = 9;
		switch(dir){
			default:
				System.out.println("X");
				//break;
			case 1:
				System.out.println("A");
				break;
			case 10:
				System.out.println("B1");
				//break;
			case b+2:
				System.out.println("B2");
				break;
		}
		
		
	}

}
