package tw.brad.bradjava;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Brad66 extends JFrame{
	private MyPainter painter;
	public Brad66(){
		setLayout(new BorderLayout());
		
		painter = new MyPainter();
		add(painter, BorderLayout.CENTER);
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Brad66();
	}
}
