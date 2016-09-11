package tw.brad.bradjava;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame {
	private JButton go;
	private JLabel[] lanes;
	
	public Racing() {
		setLayout(new GridLayout(9, 1));
		
		add(go = new JButton("Go!"));
		lanes = new JLabel[8];
		for (int i=0; i<lanes.length; i++){
			add(lanes[i] = new JLabel((i+1) + ". "));
		}
		
		setSize(1024, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
	}
	private void go(){
		Car[] cars = new Car[8];
		for (int i=0; i<cars.length; i++){
			cars[i] = new Car(i);
		}
		for (int i=0; i<cars.length; i++){
			cars[i].start();
		}
	}
	private class Car extends Thread {
		private int whichLane;
		Car(int n){whichLane = n;}
		@Override
		public void run() {
			for (int i=0; i<100; i++){
				lanes[whichLane].setText(
					lanes[whichLane].getText() + ">");
			}
		}
	}
	public static void main(String[] args) {
		new Racing();
	}

}
