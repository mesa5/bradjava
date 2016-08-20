package tw.brad.bradjava;

import javax.swing.JFrame;

public class Brad09 {
	public static void main(String[] args) {
		// switch
		int dir = 0;	// 0:STOP; 1:LEFT; 2:RIGHT, ...
		final int b = 9;
		final int STOP = 0;
		final int LEFT = 1;
		final int RIGHT = 2;
		final int UP = 3;
		final int DOWN = 4;
		switch(dir){
			case STOP:
				System.out.println("A");
				break;
			case LEFT:
				System.out.println("B1");
				break;
			case RIGHT:
				System.out.println("B2");
				break;
			case UP:
				System.out.println("C");
				break;
			case DOWN:
				System.out.println("C");
				break;
			default:
				System.out.println("X");
				break;
		}
		
		
	}

}
