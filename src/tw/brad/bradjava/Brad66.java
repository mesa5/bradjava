package tw.brad.bradjava;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brad66 extends JFrame{
	private MyPainter painter;
	private JButton clear;
	
	public Brad66(){
		setLayout(new BorderLayout());
	
		clear = new JButton("Clear");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(clear);
		add(top, BorderLayout.NORTH);
		
		painter = new MyPainter();
		add(painter, BorderLayout.CENTER);
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setupEvent();
	}
	
	private void setupEvent(){
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doClear();
			}
		});
	}
	
	private void doClear(){
		painter.clear();
	}
	
	
	public static void main(String[] args) {
		new Brad66();
	}
}
